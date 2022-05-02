public class validParentheses {
    public static void main(String[] args) {
        System.out.println(validParentheses("()"));
        System.out.println(validParentheses("())"));
        System.out.println(validParentheses("32423 (sgsdg)"));
        System.out.println(validParentheses("(dsgdsg))2432"));
        System.out.println(validParentheses("adasdasfa"));
    }

    public static boolean validParentheses(String parens) {
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