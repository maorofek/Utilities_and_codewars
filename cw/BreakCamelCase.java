public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase2("camelCasing"));
        System.out.println(camelCase2("camelCasingTest"));
        System.out.println(camelCase2("camelcasingtest"));
        System.out.println(camelCase2("itIsPossible"));
    }

    public static String camelCase(String input) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            str.append(input.charAt(i));
            if (i + 1 < input.length()) {
                if (Character.isUpperCase(input.charAt(i + 1))) {
                    str.append(" ");
                }
            }
        }
        return str.toString();
    }

    //Another sol
    public static String camelCase2(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}