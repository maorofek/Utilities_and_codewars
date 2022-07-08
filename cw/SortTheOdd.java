import java.util.Arrays;

public class SortTheOdd {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 1, 8, 0})));

    }

    public static int[] sortArray(int[] array) {
        int[] arr = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = arr[count];
                count++;
            }
        }
        return array;
    }
}
