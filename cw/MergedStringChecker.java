public class MergedStringChecker {

    public static void main(String[] args) {
//        System.out.println(isMerge("codewars", "code", "wars"));
//        System.out.println(isMerge("codewars", "cdwr", "oeas"));
//        System.out.println(isMerge("codewars", "cod", "wars"));
        System.out.println(isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    }

    //TODO
    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) return false;
        if (s.length() == 0) return true;

        return false;
    }
}