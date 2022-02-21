import java.util.Arrays;

public class SumParts {
    public static void main(String[] args) {

//        printArr(sumParts(new int[]{}));
        printArr(sumParts(new int[]{0, 1, 3, 6, 10}));//{20, 20, 19, 16, 10, 0}
//        printArr(sumParts(new int[]{1, 2, 3, 4, 5, 6}));//{21, 20, 18, 15, 11, 6, 0}
//        printArr(sumParts(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358}));//{10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0}


    }

    public static int[] sumParts(int[] ls) {
        int sum = 0;
        int size = ls.length;
        if (size == 0) {
            return new int[]{0};
        }
        int[] sums = new int[size + 1];
        for (int i = 0; i < size; i++) {
            for (int num : ls) {
                sum += num;
            }
            sums[i] = sum;
            sum = 0;
            ls = Arrays.copyOfRange(ls, 1, size + 1);
        }
        sums[size] = 0;
        return sums;
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
