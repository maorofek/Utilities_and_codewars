import java.util.HashMap;

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
        if (seconds == 0) return "now";
        HashMap<String, Integer> map = new HashMap<>();
        map.put("year", 31536000 / 356 / 24 / 60 / 60);
        map.put("month", (2592000 / 30 / 24 / 60 / 60));
        map.put("day", (86400 / 24 / 60 / 60));
        map.put("hour", (seconds / 60) / 60);
        map.put("minute", (seconds / 60) % 60);
        map.put("second", seconds % 60);
        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                sb.append(map.get(key)).append(" ").append(key).append(map.get(key) > 1 ? "s" : "");
            }
            if (key.equals("year") || key.equals("month") || key.equals("day") || key.equals("hour")) {
                sb.append(", ");
            }
            if (key.equals("min") || map.get("second") > 0 && !key.equals("second")) {
                sb.append(" and");
            }

        }
        return sb.toString();
    }
}