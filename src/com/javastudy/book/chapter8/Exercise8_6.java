package com.javastudy.book.chapter8;

/* 아래의 코드가 수행되었을 때의 실행결과를 적으시오. */

public class Exercise8_6 {
    public static void main(String[] args) {
        try {
            method1();
        } catch(Exception e) {
            System.out.println(5); // nullPointerException 으로 인해 5출력
        }
    }

    static void method1() {
        try {
            method2();
            // nullPointerException 예외 발생
            // 예외가 발생했으나 일치하는 catch가 없기 때문에 메서드 종료(finally로 인해 3 출력)
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }

        System.out.println(4);

    }

    static void method2() {
        throw new NullPointerException();
    }
}
