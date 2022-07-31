//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//public class TomerQ {
//
//    public static void main(String[] args) {
//        alg("abc");
//    }
//
//    static void alg(String str) {
//        for (Set<Character> set : powerSet(str)) { // for each set in the power set of the string
//            for (String perm : permutations(set)) { // for each permutation of the current set
//                System.out.println(perm); // print the permutation
//            }
//        }
//    }
//
//    static Set<Set<Character>> powerSet(String s) {
//        return Sets.powerSet(s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()));
//    }
//
//    static Set<String> permutations(Set<Character> s) {
//        Set<String> permutations = new HashSet();
//        permutations(new ArrayList<>(s), 0, permutations);
//        return permutations;
//    }
//
//    static void permutations(List<Character> chars, int index, Set<String> permutations) {
//        if (index == chars.size()) {
//            permutations.add(chars.stream().map(c -> c + "").collect(Collectors.joining()));
//        } else {
//            for (int i = index; i < chars.size(); i++) {
//                swap(chars, index, i);
//                permutations(chars, index + 1, permutations);
//                swap(chars, index, i);
//            }
//        }
//    }
//
//    static void swap(List<Character> chars, int i, int j) {
//        Character temp = chars.get(i);
//        chars.set(i, chars.get(j));
//        chars.set(j, temp);
//    }
//
//}
