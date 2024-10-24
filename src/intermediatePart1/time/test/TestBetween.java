package intermediatePart1.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
//        LocalDate startDate = LocalDate.of(2024, 10, 23);
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2028, 1, 1);

        Period period = Period.between(startDate, endDate);
        // 일자만 구하는 메서드 -> ChronoUnit.DAYS
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 = " + endDate);
        System.out.println("남은 기간 : " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("디데이 : " + daysBetween + "일 남음");


    }
}
