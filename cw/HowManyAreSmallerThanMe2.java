import java.util.Arrays;

public class HowManyAreSmallerThanMe2 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(smaller(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(smaller(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(smaller(new int[]{1, 2, 0})));
        System.out.println(Arrays.toString(smaller(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(smaller(new int[]{1, 1, -1, 0, 0})));
        System.out.println(Arrays.toString(smaller(new int[]{5, 4, 7, 9, 2, 4, 4, 5, 6})));
        System.out.println(Arrays.toString(smaller(new int[]{5, 4, 7, 9, 2, 4, 1, 4, 5, 6})));
    }

    //TODO
    public static int[] smaller(int[] unsorted) {
        return new int[]{};
    }
}

