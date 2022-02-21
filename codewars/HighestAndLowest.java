import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class HighestAndLowest {

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));  // return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5")); // return "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5")); // return "9 -5"
        System.out.println(highAndLow("1 9 3 1 1")); // return "9 1"
    }

    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        String max = arr[0], min = arr[0];
        for (String s : arr) {
            if (parseInt(s) > parseInt(max)) {
                max = s;
            }
            if (parseInt(s) < parseInt(min)) {
                min = s;
            }
        }
        StringBuilder sb = new StringBuilder();
        return sb.append(max).append(" ").append(min).toString();
    }


    public static String highAndLow2(String numbers) {
        IntSummaryStatistics summary = Arrays
                .stream(numbers.split(" "))
                .collect(Collectors.summarizingInt(Integer::parseInt));
        return String.format("%d %d", summary.getMax(), summary.getMin());
    }
}
