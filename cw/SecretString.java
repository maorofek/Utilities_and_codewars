import java.util.*;

public class SecretString {

    public static void main(String[] args) {
        char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}
        };
        System.out.println(recoverSecret(triplets));
    }

    public static String recoverSecret(char[][] triplets) {
        HashMap<Character, Set<Character>> map = buildMap(triplets);
        return buildString(map);
    }

    public static HashMap<Character, Set<Character>> buildMap(char[][] triplets) {
        HashMap<Character, Set<Character>> map = new HashMap<>();
        for (char[] arr : triplets) {
            for (int j = 0; j < 3; j++) {
                map.putIfAbsent(arr[j], new HashSet<>());
                if (j == 0) map.get(arr[j]).add(arr[1]);
                if (j <= 1) map.get(arr[j]).add(arr[2]);
            }
        }
        return map;
    }

    public static String buildString(HashMap<Character, Set<Character>> map) {
        StringBuilder tmp = new StringBuilder();
        while (!map.isEmpty()) {
            for (Character key : map.keySet()) {
                if (map.get(key).isEmpty()) {
                    tmp.insert(0, key);
                    for (Set<Character> set : map.values()) {
                        set.remove(key);
                    }
                    map.remove(key);
                    break;
                }
            }
        }
        return tmp.toString();
    }
}