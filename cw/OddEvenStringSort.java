import static java.lang.String.join;

public class OddEvenStringSort {
    public static void main(String[] args) {

    }

    public static String sortMyString(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i % 2) != ' ') {
                if (i % 2 == 0) {
                    even.append(s.charAt(i));
                } else {
                    odd.append(s.charAt(i));
                }
            }
        }
        return join("", even) + " " + join("", odd);
    }
}