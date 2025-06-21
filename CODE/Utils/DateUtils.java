package CODE.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String format(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return dateTime.format(formatter);
    }

    public static LocalDateTime parse(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return LocalDateTime.parse(input, formatter);
    }

    public static boolean isShowTimeValid(LocalDateTime showTime) {
        return showTime.isAfter(LocalDateTime.now());
    }
}
