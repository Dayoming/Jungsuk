package com.javastudy.book.chapter11;

/* Calendar 클래스와 SimpleDateFormat 클래스를 이용해서 2010년의 매월 두 번째 일요일의
* 날짜를 출력하시오. */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Exercise11_14 {
    public static void main(String[] args) {
        LocalDate localDate;
        for (int i = 1; i < 13; i++) {
            localDate = LocalDate.of(2018, i, 1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
            System.out.println(localDate);
        }
    }
}
