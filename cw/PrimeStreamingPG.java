import java.util.stream.IntStream;

public class PrimeStreamingPG {
    public static void main(String[] args) {

    }

    //TODO
    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static IntStream stream() {
        return IntStream.rangeClosed(2, Integer.MAX_VALUE).filter(PrimeStreamingPG::isPrime);
    }
}