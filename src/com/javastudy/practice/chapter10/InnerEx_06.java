package com.javastudy.practice.chapter10;

/*
익명 클래스란? 이름이 없는 클래스!
클래스의 선언과 객체의 선언을 동시에 하기 때문에 단 한번만 사용할 수 있고 오직 하나의 객체만을 생성할 수 있는
일회용 클래스이다.
생성자 X, 조상 클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 사용해서 정의하기 때문에
하나의 클래스로 상속받는 동시에 인터페이스를 구현하거나 둘 이상의 인터페이스를 구현할 수 없음.
오로지 단 하나의 클래스를 상속받거나 단 하나의 인터페이스 구현
*/

public class InnerEx_06 {
    Object iv = new Object() {
        void method() { }
    }; // 익명 클래스

    static Object cv = new Object() {
        void method() { }
    }; // 익명 클래스

    void myMethod() {
        Object iv = new Object() { void method() { } };
    } // 익명 클래스

}
