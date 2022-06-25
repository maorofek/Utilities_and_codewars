public class StringyStrings {

    public static void main(String[] args) {

    }

    public static String stringy(int size) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < size; i++) {
            tmp.append(i % 2 == 0 ? "1" : "0");
        }
        return tmp.toString();
    }
}
