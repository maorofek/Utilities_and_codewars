import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int remaining;
        for (int i = 0; i < numbers.length; i++) {
            remaining = target - numbers[i];
            if (map.containsKey(remaining)) {
                return new int[]{i, map.get(remaining)};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
