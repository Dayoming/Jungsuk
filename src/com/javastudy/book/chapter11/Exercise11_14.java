package com.javastudy.book.chapter11;

/* Calendar 클래스와 SimpleDateFormat 클래스를 이용해서 2010년의 매월 두 번째 일요일의
* 날짜를 출력하시오. */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise11_14 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.set(2010, 0, 1);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");
        for (int i = 0; i < 12; i++) {
            for (int j = 1; j < calendar.getActualMaximum(Calendar.DAY_OF_MONTH) + 1; j++) {
                calendar.set(2010, i, j);
                System.out.println(format.format(calendar.getTime()));
            }
        }

    }
}
