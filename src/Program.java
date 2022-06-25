import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getPower(new int[]{2, 3, 4, 5})));


    }

    // get array of numbers and return power(number, 2)
    public static int[] getPower(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = (int) Math.pow(numbers[i], 2);
        }
        return result;
    }

    //create function that takes in a string and returns the string in reverse order
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // return sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //return power set of string
    public static String powerSet(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j) {
                    result += str.charAt(i) + str.charAt(j);
                }
            }
        }
        return result;
    }
}
