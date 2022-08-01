import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleFun_MiddlePermutation {
    public static void main(String[] args) {
        permutations2("abc");
        System.out.println(findMidPerm("waogibvrdcqhkm"));
        System.out.println("------------------------------------------------------------------------------------");
//        System.out.println(findMidPerm("abcd"));
//        System.out.println("------------------------------------------------------------------------------------");
//        System.out.println(findMidPerm("abcdx"));
//        System.out.println("------------------------------------------------------------------------------------");
//        System.out.println(findMidPerm("abcdxg"));
//        System.out.println("------------------------------------------------------------------------------------");
//        System.out.println(findMidPerm("abcdxgz"));
    }

    public static String findMidPerm(String string) {
        List<String> myList = permutations(string);
//        System.out.println(string + " has " + myList.size() + " permutations");
//        for (String s : myList) {
//            System.out.print(s + ", ");
//        }
//        System.out.println();
//        System.out.print("mid is: ");
        return myList.size() % 2 == 0 ? myList.get(myList.size() / 2 - 1) : myList.get(myList.size() / 2);
    }

    private static ArrayList<String> permutations(String string) {
        if (string.length() == 0) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        char ch = string.charAt(0);
        String subStr = string.substring(1);
        ArrayList<String> prevResult = permutations(subStr);
        ArrayList<String> res = new ArrayList<>();
        for (String val : prevResult) {
            for (int i = 0; i <= val.length(); i++) {
                res.add(val.substring(0, i) + ch + val.substring(i));
            }
        }
        List<String> sortedList = res.stream().sorted().collect(Collectors.toList());
        return (ArrayList<String>) sortedList;
    }

    static void permutations2(String string) {
        perm(string, "");
    }

    static void perm(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) +
                        str.substring(i + 1);
                perm(rem, prefix + str.charAt(i));
            }
        }
    }
}