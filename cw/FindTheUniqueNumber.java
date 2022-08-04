import java.util.Arrays;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }

    public static double findUniq(double arr[]) {
        double unique = 0;
        Arrays.sort(arr);
        if (arr[0] != arr[1]) {
            unique = arr[0];
        } else {
            unique = arr[arr.length - 1];
        }
        return unique;
    }
}