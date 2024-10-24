package intermediatePart1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {

        // 포맷팅 : 날짜를 문자로 + 시간 포함
        LocalDateTime localDateTime = LocalDateTime.of(2024, 10, 23, 01, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDateTime);

        // 파싱 : 문자를 날짜로 + 시간 포함
        String dateTimeString = "2024-10-23 01:30:59";
        LocalDateTime parsedDate = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDate);
    }
}
