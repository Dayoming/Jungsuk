package com.javastudy.practice.chapter9;

public class StringEx_06 {
    public static void main(String[] args) {
        char[] cArr = new char[0]; // char[] cArr = { }; 와 같음
        String s = new String(cArr);

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");

        //크기가 0인 배열이 존재할 수 있다.

    }
}
