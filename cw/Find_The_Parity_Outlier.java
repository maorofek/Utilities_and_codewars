import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_The_Parity_Outlier {

    public static void main(String[] args) {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        int[] myTest = {2, 4, 0, 100, 4, 11, 2602, 36};

        System.out.println(find(exampleTest1));
        System.out.println(find(exampleTest2));
        System.out.println(find(exampleTest3));
        System.out.println(find(myTest));

    }

    static int find(int[] integers) {
        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        map.put("odd", new ArrayList<>());
        map.put("even", new ArrayList<>());
        for (int number : integers) {
            if (number % 2 == 0) {
                map.get("even").add(number);
            } else {
                map.get("odd").add(number);
            }
        }
        if (map.get("even").size() == 1) {
            return map.get("even").get(0);
        } else {
            return map.get("odd").get(0);
        }
    }
}


//print map
// for (String keys : map.keySet()) {
//            System.out.println(keys + ":" + map.get(keys));
//        }