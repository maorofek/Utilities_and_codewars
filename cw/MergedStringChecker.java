public class MergedStringChecker {

    public static void main(String[] args) {
//        System.out.println(isMerge("codewars", "code", "wars"));
//        System.out.println(isMerge("codewars", "cdwr", "oeas"));
//        System.out.println(isMerge("codewars", "cod", "wars"));
        System.out.println(isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    }

    //TODO
    public static boolean isMerge(String s, String part1, String part2) {
//        System.out.println(s);
//        System.out.println(part1);
//        System.out.println(part2);

        if (s.length() != part1.length() + part2.length()) return false;
        if (s.length() == 0) return true;
        StringBuilder tmp = new StringBuilder();
        int strIndex = 0, part1Index = 0, part2Index = 0;

        while (strIndex < s.length()) {
            if (part2Index < part2.length() && s.charAt(strIndex) == part2.charAt(part2Index)) {
                tmp.append(part2.charAt(part2Index));
                part2Index++;
                strIndex++;
            } else if (part1Index < part1.length() && s.charAt(strIndex) == part1.charAt(part1Index)) {
                tmp.append(part1.charAt(part1Index));
                part1Index++;
                strIndex++;
            } else {
                return false;
            }
        }
        return tmp.toString().equals(s);
    }
}