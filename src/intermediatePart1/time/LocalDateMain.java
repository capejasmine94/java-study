package intermediatePart1.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2024, 10, 23);

        System.out.println("오늘 날짜 : " + nowDate);
        System.out.println("지정 날짜 : " + ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(1165);
        System.out.println("지정 날짜 + 10d : " + ofDate);
    }
}
