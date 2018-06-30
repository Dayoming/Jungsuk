package com.javastudy.book.chapter11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise11_19 {

    public static long getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        int diff = 0;

            int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
            int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6));
            int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));

            int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
            int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6));
            int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8)); // 28 라인 길이 오류

            LocalDate day3 = LocalDate.of(year1, month1, day1);
            LocalDate day4 = LocalDate.of(year2, month2, day2);

            return ChronoUnit.DAYS.between(day4, day3);
    }

    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103", "20010101"));
        System.out.println(getDayDiff("20010103", "20010103"));
        System.out.println(getDayDiff("20010103", "200103"));
    }
}
