public class GetTheMiddleCharacter {
    public static void main(String[] args) {

    }

    public static String getMiddle(String word) {
        int i = word.length() / 2;

        if (word.length() % 2 == 0) {
            return word.substring(i - 1, i + 1);
        } else {
            return String.valueOf(word.charAt(i));
        }
    }
}
