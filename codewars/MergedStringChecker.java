public class MergedStringChecker {

    public static void main(String[] args) {
        System.out.println(isMerge("codewars", "code", "wars"));
        System.out.println(isMerge("codewars", "cdwr", "oeas"));
        System.out.println(isMerge("codewars", "cod", "wars"));
    }

    //TODO
    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) return false;
        if (s.length() == 0) return true;
        StringBuilder tmp = new StringBuilder();
        int strIndex = 0, part1Index = 0, part2Index = 0;
        for (; strIndex < s.length(); strIndex++) {
            if (part1Index <= strIndex / 2 && s.charAt(strIndex) == part1.charAt(part1Index)) {
                tmp.append(s.charAt(strIndex));
                part1Index++;
            } else if (part1Index <= strIndex / 2 && s.charAt(strIndex) == part2.charAt(part2Index)) {
                tmp.append(s.charAt(strIndex));
                part2Index++;
            }
        }
        return tmp.toString().equals(s);
    }
}