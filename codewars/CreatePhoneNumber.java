public class CreatePhoneNumber {

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        String result = "";
        for (int number : numbers) {
            result += number;
        }
        return "(" + result.substring(0, 3) + ") " + result.substring(3, 6) + "-" + result.substring(6, 10);
    }
}