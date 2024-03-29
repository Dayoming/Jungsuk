package com.javastudy.book.chapter11;

/* 화면으로부터 날짜를 "2007/05/11"의 형태로 입력받아서 무슨 요일인지 출력하는 프로그램을
작성하시오. */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String pattern = "yyyy/MM/dd";
        String pattern2 = "입력하신 날짜는 E요일입니다.";

        DateFormat dateFormat = new SimpleDateFormat(pattern);
        DateFormat dateFormat2 = new SimpleDateFormat(pattern2);

        Date date = null;

        do {
            System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요."
            + "(입력예:2017/05/11)");
            try {
                System.out.print(">>");
                date = dateFormat.parse(s.nextLine());
                break;
            } catch (Exception e) {
            }
        } while (true);

        System.out.println(dateFormat2.format(date));
    }
}
