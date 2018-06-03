package com.javastudy.book.chapter7;

/* Math 클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
생성자가 private로 선언된 경우 인스턴스 생성이 불가능하고 생성자를 호출할 수 없어 서브클래스를 만들 수 없다.
따라서 java.util.Arrays나 Date, java.lang.Math는 굳이 인스턴스를 생성할 필요가 없으므로 private로 선언한다.
단, private로 선언된 클래스에는 접근할 방법이 없으므로 클래스의 메서드와 필드는 static으로 선언한다.
static 메서드와 static 필드로 선언된 클래스는 생성자가 private 로 선언되어 있다.
 */

public class Exercise7_13 {
    public static void main(String[] args) {
        int test = (int)(Math.random() * 10) + 1;
        System.out.println(test);
    }
}
