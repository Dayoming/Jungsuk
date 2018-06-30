package com.javastudy.book.chapter11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String pattern = "yyyy/MM/dd";
        String pattern2 = "입력하신 날짜는 E요일입니다.";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern(pattern2);

        LocalDate date = null;

        do {
            System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요."
            + "(입력예:2017/05/11)");

            try {
                System.out.print(">>");
//                date = dateTimeFormatter.parse(s.nextLine());
                break;
            } catch (Exception e) {
            }
        } while (true);

//        System.out.println(dateTimeFormatter2(date));
    }
}
