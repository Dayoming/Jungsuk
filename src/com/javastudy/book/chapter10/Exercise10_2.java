package com.javastudy.book.chapter10;

class Outer2 {
    static class Inner {
        int iv = 200;
    }
}

public class Exercise10_2 {
    public static void main(String[] args) {
        Outer2.Inner inner =  new Outer2.Inner();
        System.out.println(inner.iv);
    }
}
