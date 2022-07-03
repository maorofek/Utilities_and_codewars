import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        System.out.println(Arrays.toString(input));

        int[] result = new int[2];
        Arrays.stream(input).forEach(x -> {
            if (x > 0) {
                result[0]++;
            } else if (x < 0) {
                result[1] += x;
            }
        });
        return result;
    }
}
