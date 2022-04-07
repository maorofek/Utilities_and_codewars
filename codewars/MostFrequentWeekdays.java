import java.time.*;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Locale.UK;

public class MostFrequentWeekdays {

    public static void main(String[] args) {
//        int daysInYear = Year.of(2000).length();
        System.out.println(Arrays.toString(mostFrequentDays(1984)));

    }

    public static String[] mostFrequentDays(int year) {
        String[] daysWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        YearMonth ym = YearMonth.of(year, 1);
        YearMonth ym2 = YearMonth.of(year, 12);
        String startedDay = ym.atDay(1).getDayOfWeek().getDisplayName(TextStyle.FULL, UK);
        String lastDay = ym2.atEndOfMonth().getDayOfWeek().getDisplayName(TextStyle.FULL, UK);
        int startedDayIndex = 0;
        int lastDayIndex = 0;
        for (int i = 0; i < daysWeek.length; i++) {
            if (startedDay.equals(daysWeek[i])) {
                startedDayIndex = i;
            }
            if (lastDay.equals(daysWeek[i])) {
                lastDayIndex = i;
            }
        }
        if (startedDayIndex == lastDayIndex) {
            return new String[]{startedDay};
        } else {
            if (startedDayIndex > lastDayIndex) {

                return new String[]{lastDay, startedDay};
            }
            return new String[]{startedDay, lastDay};
        }
    }

}