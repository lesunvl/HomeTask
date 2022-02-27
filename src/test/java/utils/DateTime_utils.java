package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_utils {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyy_HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public String currentDateTime = formatter.format(now);
}

