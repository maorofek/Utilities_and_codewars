import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsecutiveStrings {
    public static void main(String[] args) {
        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));// "abigailtheta");
        System.out.println(longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));// "oocccffuucccjjjkkkjyyyeehh")
        System.out.println(longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));//"wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck";
        System.out.println(longestConsec(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2));
        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}, -2));// ""
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3)); //"ixoyx3452zzzzzzzzzzzz"
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15));// ""
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0));// ""

    }

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }
        String result = "";
        int maxLength = 0;
        for (int i = 0; i < strarr.length - k + 1; i++) {
            String temp = "";
            for (int j = 0; j < k; j++) {
                temp += strarr[i + j];
            }
            if (temp.length() > maxLength) {
                maxLength = temp.length();
                result = temp;
            }
        }
        return result;
    }

    public static String longestConsec2(String[] strarr, int k) {
        if (k <= 0) {
            return "";
        }
        return IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(Collectors.joining()))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
