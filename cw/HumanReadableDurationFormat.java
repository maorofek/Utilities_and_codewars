import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanReadableDurationFormat {

    public static void main(String[] args) {

        System.out.println(formatDuration(1));
        System.out.println(formatDuration(62));
        System.out.println(formatDuration(120));
        System.out.println(formatDuration(3600));
        System.out.println(formatDuration(3662));
        System.out.println(formatDuration(366200));
    }

    //TODO
    public static String formatDuration(int seconds) {
        List<String> list = new ArrayList<>();

        if (seconds <= 0) {
            return "now";
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(31536000, " year");
        map.put(86400, " day");
        map.put(3600, " hour");
        map.put(60, " minute");
        map.put(1, " second");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (seconds >= entry.getKey()) {
                int n = seconds / entry.getKey();
                list.add(n + entry.getValue() + (n > 1 ? "s" : ""));
                seconds -= n * entry.getKey();
            }
        }
        return String.join(", ", list).replaceAll(", (?!.+,)", " and ");
    }
}
