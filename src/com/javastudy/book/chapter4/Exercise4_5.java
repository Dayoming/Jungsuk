package com.javastudy.book.chapter4;

public class Exercise4_5 {
    public static void main(String[] args) {
        while1();
        for1();

    }

    public static void for1() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void while1() {
        int i = 0;
        while (i <= 10) {
            int j = 0;
            while(j <= i) {
                j++;
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
