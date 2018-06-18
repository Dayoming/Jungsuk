package com.javastudy.practice.chapter10;

public class InnerEx_01 {
    class InstanceInner { // instance 클래스
        int iv = 100;
        // static int cv = 100;
        // Instance 클래스에서 static 변수를 선언할 수 없다.
        final static int CONST = 100; // final static은 상수이므로 허용(final이 붙은 경우엔 어떤 경우라도 static 가능)
    }

    static class StaticInner { // static 클래스
        int iv = 200;
        static int cv = 200; // static 클래스에서는 가능
    }

    void myMethod() { // 지역 클래스
        class LocalInner {
            int iv = 300;
            // static int cv = 300;
            // 불가능
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }


}
