import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        System.out.println(numbers(4, 400, 34, 123, 12323, 2313123));

    }

    public static List<Integer> numbers(Integer... integers) {
        return Arrays.stream(integers).filter(number -> number > 100).collect(Collectors.toList());
    }

}