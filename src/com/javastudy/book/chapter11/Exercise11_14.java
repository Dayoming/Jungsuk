package com.javastudy.book.chapter11;

/* Calendar 클래스와 SimpleDateFormat 클래스를 이용해서 2010년의 매월 두 번째 일요일의
* 날짜를 출력하시오. */

import java.time.LocalDate;

public class Exercise11_14 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate temp = LocalDate.of(2010, 1, 1);
//        LocalDate year = now.withYear(2010);
        int yearInt = temp.getYear();
        for (int i = 1; i < 13; i++) {
            LocalDate month = temp.withMonth(i);
            int monthInt = month.getMonthValue();
            int monthDays = month.lengthOfMonth();
            for (int j = 1; j < monthDays + 1; j++) {
                LocalDate days = temp.withDayOfMonth(j);
                int dayInt = days.getDayOfMonth();
                LocalDate changeDate = LocalDate.of(yearInt, monthInt, dayInt);
            }
        }
    }
}
