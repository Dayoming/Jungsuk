package com.javastudy.book.chapter9;

// from의 값이 to의 값보다 클 경우도 처리

public class Exercise9_12 {

    public static int getRand(int from, int to) {
        int randomInt = (int)(Math.random() * (Math.abs(to-from) + 1)) + Math.min(from, to);
        return randomInt;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(getRand(-1, 3) + ",");
        }
    }
}
