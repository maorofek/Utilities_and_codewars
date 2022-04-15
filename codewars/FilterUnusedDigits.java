import java.util.Arrays;

public class FilterUnusedDigits {

    public static void main(String[] args) {
        int[] input = new int[]{4, 3, 9, 7, 2, 1};       //  int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };

        int[] result = squareOrSquareRoot(input);
    }

    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array).map(x -> {
            double sqrt = Math.sqrt(x);
            if (sqrt % 1 == 0) {
                return (int) Math.sqrt(x);
            }
            return x * x;
        }).toArray();
    }

    public static int[] squareOrSquareRoot2(int[] array) {
        return Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
                .toArray();
    }

}
