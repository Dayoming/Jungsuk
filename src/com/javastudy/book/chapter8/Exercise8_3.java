package com.javastudy.book.chapter8;

/* 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)
        void add(int a, int b)
        throws InvalidNumberException, NotANumberException() { }

        class NumberException extends Exception { }
        class InvalidNumberException extends NumberException { }
        class NotANumberException extends NumberException { }

    a. void add(int a, int b) throws InvalidNumberException, NotANumberException { }
    b. void add(int a, int b) throws InvalidNumberException { }
    c. void add(int a, int b) throws NotANumberException { }
    d. void add(int a, int b) throws Exception { }
    e. void add(int a, int b) throws NumberException { }

    정답 : d, e
    오버라이딩 시 원래 메서드보다 많은 수의 예외를 선언할 수 없음!
 */

public class Exercise8_3 {

}
