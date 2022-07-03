import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class CountTheNumberOfDaysBetweenTwoDates {

    public static void main(String[] args) {
        System.out.println(getDaysAlive(1987, 1, 16, 2000, 10, 15));
    }

    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {
        LocalDate dateBefore = LocalDate.of(year, month, day);
        LocalDate dateAfter = LocalDate.of(year2, month2, day2);
        return DAYS.between(dateBefore, dateAfter);
    }
}
