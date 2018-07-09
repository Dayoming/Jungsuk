package com.javastudy.book.chapter11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Exercise11_14_1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd은 W번째 E요일입니다.");
        for (int i = 1; i < 13; i++) {
            LocalDate localDate = LocalDate.of(2010, i, 1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
            System.out.println(localDate.format(formatter));
        }

    }
}
