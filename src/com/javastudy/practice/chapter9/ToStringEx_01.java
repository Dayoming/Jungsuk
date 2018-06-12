package com.javastudy.practice.chapter9;

class Card1 {
    String kind;
    int number;

    Card1() {
        this("SPADE", 1);
    }

    Card1(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

public class ToStringEx_01 {
    public static void main(String[] args) {
        Card1 c1 = new Card1();
        Card1 c2 = new Card1();

        System.out.println(c1.toString()); // Object 클래스에서 오버라이딩
        System.out.println(c2.toString());
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
