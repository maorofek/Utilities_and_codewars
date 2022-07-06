import java.util.stream.IntStream;

public class DontGiveMeFive {

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1, 9));
    }

    public static int dontGiveMeFive(int start, int end) {
        return (int) IntStream.range(start, end + 1).filter(e -> !String.valueOf(e).contains("5")).count();
    }
}
