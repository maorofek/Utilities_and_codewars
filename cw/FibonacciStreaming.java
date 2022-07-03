import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciStreaming {

    public static void main(String[] args) {

    }

    public static IntStream generateFibonacciSequence() {
        return Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]}).mapToInt(a -> a[1]);
    }
}