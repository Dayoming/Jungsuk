package com.javastudy.practice.chapter10;

class Outer2 {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;
            System.out.println("             value : " + value);
            System.out.println("        this.value : " + this.value);
            System.out.println("  Outer.this.value : " + Outer2.this.value);
        }
    }
}

public class InnerEx_05 {
    public static void main(String[] args) {
     Outer2 outer = new Outer2();
     Outer2.Inner inner = outer.new Inner();
     inner.method1();
    }
}
