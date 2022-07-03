import java.util.stream.IntStream;

public class Multiplesof3or5 {

    public static void main(String[] args) {

        System.out.println(Solution2(10) == 23);
    }

    public static int Solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int Solution2(int number) {
        return IntStream.range(0, number)
                .filter(x -> (x % 3 == 0) || (x % 5 == 0)).sum();
    }
}