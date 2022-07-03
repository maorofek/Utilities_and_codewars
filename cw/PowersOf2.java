import java.util.Arrays;

import static java.util.stream.IntStream.rangeClosed;

public class PowersOf2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(2)));
    }

    public static long[] powersOfTwo(int n) {
        return rangeClosed(0, n).mapToLong(i -> (long) Math.pow(2, i)).toArray();
    }

    public static long[] powersOfTwo2(int n) {
        long[] result = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = (long) Math.pow(2, i);
        }
        return result;
    }

}
