package com.javastudy.book.chapter11;

/* 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
메서드명 : getDayDiff
기    능 : yyyymmdd 형식의 두 문자열을 넘겨받으면 두 날짜의 차이를 일(day) 단위로 반환한다.
           단, 첫 번째 날짜 빼기 두 번째 날짜의 결과를 반환한다.
           만일 주어진 문자열이 유효하지 않으면 0을 반환한다.
반환타입 : int
매개변수 : String yyyymmdd1 - 시작날짜
           String yyyymmdd2 - 끝 날짜 */

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;

public class Exercise11_19 {

    public static long getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        int diff = 0;

//            return ChronoUnit.DAYS.between(day4, day3);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyymmdd");
        Date date;
        try {
            Date firstDate = simpleDateFormat.parse(yyyymmdd1);
            Date seconDate = simpleDateFormat.parse(yyyymmdd2);

            long calDate = firstDate.getTime() - seconDate.getTime();
            // getTime() 메소드는 해당 날짜가 1970년 1월 1일 00:00:00시 부터
            // 얼마나 지났는지를 리턴한다.
//            System.out.println(calDate);
            long calDateDays = calDate / (24*60*60*1000);
            return calDateDays;

        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103", "20010101"));
        System.out.println(getDayDiff("20010103", "20010103"));
        System.out.println(getDayDiff("20010103", "200103"));
    }
}
