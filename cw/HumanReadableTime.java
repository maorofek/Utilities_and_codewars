import java.text.DecimalFormat;

public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(3600));
        System.out.println(makeReadable(352881));
        System.out.println(makeReadable(359999));

    }

    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int min = seconds / 60;
        seconds -= min * 60;
        if (min >= 60) {
            min -= 60;
            hours += 1;
        }

        DecimalFormat formatter = new DecimalFormat("00");
        String aFormatString = formatter.format(seconds);
        String bFormatString = formatter.format(min);
        String cFormatString = formatter.format(hours);
        return cFormatString + ":" + bFormatString + ":" + aFormatString;
    }

    public static String makeReadable2(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
}