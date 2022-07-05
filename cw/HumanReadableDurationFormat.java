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
        int sec = seconds % 60;
        int min = (seconds / 60) % 60;
        int hours = (seconds / 60) / 60;

        String strSec = (sec < 10) ? "0" + sec : Integer.toString(sec);
        String strmin = (min < 10) ? "0" + min : Integer.toString(min);
        String strHours = (hours < 10) ? "0" + hours : Integer.toString(hours);

        if (hours == 0) {
            return strmin + "minute  " + strSec + "seconds";
        } else if (hours == 1) {
            return strHours + "hour " + strmin + "minute  " + strSec + "seconds";
        } else {
            return strHours + "hour " + strmin + "minute  " + strSec + "seconds";
        }
    }
}