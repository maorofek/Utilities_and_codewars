import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
    }

    //TODO
    public static int[] countPositivesSumNegatives(int[] input) {
//        if (input.length == 0 || input[0] == 0 || input[1] == 0) {
//            return new int[0];
//        }
        int[] result = new int[2];
        Arrays.stream(input).forEach(x -> {
            if (x > 0) {
                result[0]++;
            } else {
                result[1] += x;
            }
        });
        return result;
    }
}
