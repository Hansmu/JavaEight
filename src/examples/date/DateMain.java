package examples.date;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class DateMain {

    public static void main(String[] args) {

        dateAndTimevaluesExample();
    }

    private static void instantToRepresentMomentOnTimeLine() {
        //Current time.
        Instant start = Instant.now();//Instant on the Java timeline. Instant represents number of milliseconds since Epoch. January 1st, 1970.
        System.out.println(start);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();
        System.out.println(end);

        //When comparing two instants, you get a duration.
        Duration elapsed = Duration.between(start, end);

        System.out.println("Elapsed: " + elapsed.toMillis() + " milliseconds.");
    }

    private static void dateAndTimevaluesExample() {
        //Only want the current date.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        System.out.println("Day of week: " + currentDate.getDayOfWeek());
        System.out.println("Month: " + currentDate.getMonth());

        //Not zero based.
        LocalDate specificDate = LocalDate.of(2000, 1, 1);
        System.out.println(specificDate);

        //To represent just the time.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime specificTime = LocalTime.of(14, 0, 45);

        //LocalDateTime to combine date and time.
    }

    private static void formattingDateTime() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println(dateFormatter.format(currentDate));

        //Building custom formatters
        DateTimeFormatterBuilder formatter = new DateTimeFormatterBuilder()
                                        .appendValue(ChronoField.MONTH_OF_YEAR)
                                        .appendLiteral("||")
                                        .appendValue(ChronoField.DAY_OF_MONTH)
                                        .appendLiteral("||")
                                        .appendValue(ChronoField.YEAR);

        DateTimeFormatter f = formatter.toFormatter();
        System.out.println(f.format(currentDate));
    }
}
