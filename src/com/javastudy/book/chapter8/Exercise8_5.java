package com.javastudy.book.chapter8;

/* 아래의 코드가 수행되었을 때의 실행결과를 적으시오. */

public class Exercise8_5 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if(b) throw new ArithmeticException();
            // b가 true이면 ArithmeticException 발생(산술 연산에 문제가 있을 때 생기는 예외
            System.out.println(2);
        } catch (RuntimeException r) { // ArithmeticException은 RuntimeException의 자손 클래스
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);
        method(false);
    }
}
