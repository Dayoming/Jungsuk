package com.javastudy.practice.chapter9;

import java.util.Date;

public class ToStringEx_02 {
    public static void main(String[] args) {
        String str = new String("KOREA");
        Date today = new Date();

        System.out.println(str);
        System.out.println(str.toString()); // String 클래스에서 오버라이딩
        System.out.println(today);
        System.out.println(today.toString()); // Date 클래스에서 오버라이딩
    }
}