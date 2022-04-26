import java.util.Arrays;

public class LengthOfMissingArray {

    public static void main(String[] args) {
//        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{1, 2}, new Object[]{4, 5, 1, 1}, new Object[]{1}, new Object[]{5, 6, 7, 8, 9}}));
//        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{5, 2, 9}, new Object[]{4, 5, 1, 1}, new Object[]{1}, new Object[]{5, 6, 7, 8, 9}}));
//        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{null}, new Object[]{null, null, null}}));
//        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{'a', 'a', 'a'}, new Object[]{'a', 'a'}, new Object[]{'a', 'a', 'a', 'a'}, new Object[]{'a'}, new Object[]{'a', 'a', 'a', 'a', 'a', 'a'}}));
//        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{5, 2, 9}, new Object[]{4, 5, 1, 1, 5, 6}, new Object[]{1, 1}, new Object[]{5, 6, 7, 8, 9}}));
//        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{2, 0, 1, 0, 0}, new Object[]{0, 3}, new Object[]{0, 0, 4, 4, 3, 3, 0}, new Object[]{4, 1, 2, 0, 2, 0, 3, 4}, new Object[]{2}
//                , new Object[]{2, 3, 1, 4, 3, 2}, new Object[]{}, new Object[]{1, 1, 4}}));
        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{1, 2}, new Object[]{null, null, null}}));
    }

    //TODO
    //doesn't start always from length = 1
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        System.out.println(Arrays.deepToString(arrayOfArrays));
        int smallestSize = 99999;
        int numberOfArrays = 0;
        numberOfArrays = arrayOfArrays == null ? 0 : arrayOfArrays.length;
        boolean[] bool = new boolean[numberOfArrays + 1];

        if (numberOfArrays == 0) {
            return 0;
        }
        for (Object[] array : arrayOfArrays) {
            if (array == null) {
                return 0;
            }
            if (array.length == 0) {
                smallestSize = 0;
            }
            if (array.length < smallestSize) {
                smallestSize = array.length;
            }
        }
        for (Object[] array : arrayOfArrays) {
            bool[array.length - smallestSize] = true;
        }
        for (int i = 0; i < bool.length; i++) {
            if (!bool[i] && i == 0) {
                return i;
            }
            if (!bool[i]) {
                return i + smallestSize;
            }
        }
        return 0;
    }
}
