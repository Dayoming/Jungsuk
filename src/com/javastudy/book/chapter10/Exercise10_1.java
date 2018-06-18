package com.javastudy.book.chapter10;

/* Outer 클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오. */

class Outer {
    class Inner {
        int iv = 100;
    }
}

public class Exercise10_1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.iv);
    }
}
