import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{2, 5, 34, 6}));

    }

    public static String oddOrEven(int[] array) {
        int sum = Arrays.stream(array).sum();
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}