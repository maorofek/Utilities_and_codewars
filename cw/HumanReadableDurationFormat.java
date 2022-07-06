import java.util.HashMap;
import java.util.LinkedHashMap;

public class HumanReadableDurationFormat {

    public static void main(String[] args) {

        System.out.println(formatDuration(1));
        System.out.println(formatDuration(62));
        System.out.println(formatDuration(120));
        System.out.println(formatDuration(3600));
        System.out.println(formatDuration(3662));
        System.out.println(formatDuration(366200));
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("year", seconds / 365 / 24 / 60 / 60);
        map.put("day", ((seconds / 24 / 60 / 60)) % 365);
        map.put("hour", ((seconds / 60) / 60) % 24);
        map.put("minute", (seconds / 60) % 60);
        map.put("second", seconds % 60);
        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                sb.append(map.get(key)).append(" ").append(key).append(map.get(key) > 1 ? "s" : "").append(", ");
            }
        }
        sb.setLength(sb.length() - 2);
        if (sb.toString().contains(",")) {
            sb.replace(sb.lastIndexOf(", "), sb.lastIndexOf(", ") + 2, " and ");
        }
        return sb.toString();
    }
}