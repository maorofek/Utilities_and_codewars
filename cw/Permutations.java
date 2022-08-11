import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(singlePermutations("abc"));
//        singlePermutations("abc");
    }

    public static <T> List<T> convertToList(Set<T> set) {
        // create an empty list
        List<T> items = new ArrayList<>();

        // push each set element into the list
        items.addAll(set);

        // return the list
        return items;
    }

    public static List<String> singlePermutations(String s) {
        List<String> permutations = new ArrayList<>();
        permutation(permutations, "", s);
        Set<String> set = new HashSet<>(permutations);
        return convertToList(set);
    }

    private static void permutation(List<String> list, String prefix, String str) {
        int n = str.length();
        if (n == 0)
            list.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(list, prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }
}
