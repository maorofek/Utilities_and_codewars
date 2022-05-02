import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidBraces {

    public static void main(String[] args) {


    }

    public boolean isValid(String braces) {
        String tmp1 = "{}";
        String tmp2 = "()";
        String tmp3 = "[]";
        while (braces.contains("{}") || braces.contains("[]") || braces.contains("()")) {
            braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
        }
        return braces.isEmpty();
    }

    //Another sol
    public boolean isValid2(String s) {
        int x = s.length();
        s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}", "");
        return s.length() != x && (s.length() == 0 || isValid(s));
    }

    public boolean isValid3(String braces) {
        Stack<Character> s = new Stack<>();
        for (char c : braces.toCharArray())
            if (s.size() > 0 && isClosing(s.peek(), c)) s.pop();
            else s.push(c);
        return s.size() == 0;
    }

    public boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }
}