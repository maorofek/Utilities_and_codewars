import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib2(6));

    }

    public static long fib(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static long fib2(int n) {
        return Stream.iterate(new long[]{1, 1}, i -> new long[]{i[1], i[0] + i[1]})
                .limit(n)
                .reduce((x, y) -> y)
                .get()[0];
    }

}
