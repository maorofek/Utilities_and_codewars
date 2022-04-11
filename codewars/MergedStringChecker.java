public class MergedStringChecker {

    public static void main(String[] args) {
        System.out.println(isMerge("codewars", "code", "wars"));
        System.out.println(isMerge("codewars", "cdwr", "oeas"));
        System.out.println(isMerge("codewars", "cod", "wars"));
    }

    //TODO
    public static boolean isMerge(String s, String part1, String part2) {
        StringBuilder tmp = new StringBuilder();

        return tmp.toString().equals(s);
    }
}
