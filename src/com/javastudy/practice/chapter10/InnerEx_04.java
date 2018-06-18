package com.javastudy.practice.chapter10;

class Outer {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}

public class InnerEx_04 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InstanceInner ii = outer.new InstanceInner();

        System.out.println("인스턴스메소드.인스턴스변수 : " + ii.iv);
        System.out.println("Outer.스태틱메소드.스태틱변수 : " + Outer.StaticInner.cv);

        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("스태틱메소드.인스턴스변수 : " + si.iv);

    }
}
