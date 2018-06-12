package com.javastudy.practice.chapter9;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int num) {
        this.kind = kind;
        this.number = num;
    }

    @Override
    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }
}

public class ToStringEx_03 {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        System.out.println(c.toString());
    }
}
