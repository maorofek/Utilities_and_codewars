import java.util.Arrays;

public class CharacterWithLongestConsecutiveRepetition {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(longestRepetition("aaaabb")));
        System.out.println(Arrays.toString(longestRepetition("bbbaaabaaaa")));
        System.out.println(Arrays.toString(longestRepetition("cbdeuuu900")));
        System.out.println(Arrays.toString(longestRepetition("abbbbb")));
        System.out.println(Arrays.toString(longestRepetition("aabb")));
        System.out.println(Arrays.toString(longestRepetition("")));
    }

    public static Object[] longestRepetition(String s) {
        if (s.length() == 0) {
            return new Object[]{"", 0};
        }
        int max = 0;
        char c = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
                c = s.charAt(i);
            }
        }
        return new Object[]{c + "", max};
    }
}
