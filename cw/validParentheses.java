public class validParentheses {
    public static void main(String[] args) {
        System.out.println(validParenthesesFunc("()"));
        System.out.println(validParenthesesFunc("())"));
        System.out.println(validParenthesesFunc("32423 (sgsdg)"));
        System.out.println(validParenthesesFunc("(dsgdsg))2432"));
        System.out.println(validParenthesesFunc("adasdasfa"));
    }

    public static boolean validParenthesesFunc(String parens) {
        int open = 0;
        int close = 0;
        for (char c : parens.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                close++;
            }
            if (close > open) {
                return false;
            }
        }
        return open == close;
    }
}