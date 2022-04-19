import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetSum_Q2 {

    static boolean isSubsetSumForAllNumbers(int[] set, int sum) {
        int bigNumber = (int) 1E6; // assume very big number -> at least as big as abs(min(set))
        List<Integer> transformedSet = Arrays.stream(set).map(x -> x + bigNumber).boxed().collect(Collectors.toList());
        int n = transformedSet.size();
        for (int i = 0; i < n; i++) {
            transformedSet.add(bigNumber);
        }
        return isSubsetSumForPositiveNumbers(transformedSet.stream().mapToInt(x -> x).toArray(), transformedSet.size(), n * bigNumber + sum);
    }

    static boolean isSubsetSumForPositiveNumbers(int[] set, int n, int sum) {
        boolean[][] subset = new boolean[sum + 1][n + 1];
        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1]) subset[i][j] = subset[i][j] || subset[i - set[j - 1]][j - 1];
            }
        }
        return subset[sum][n];
    }

    public static void main(String[] args) {
        int[] A = {9, -3, 2, 4, -5, -1};
        int S = 7;
        System.out.println(isSubsetSumForAllNumbers(A, S));
    }
}