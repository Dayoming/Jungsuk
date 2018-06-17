package com.javastudy.book.chapter4;

public class Exercise4_12 {

    public static void main(String[] args) {
        for(int i = 1; i <= 9; ++i) {
            for(int j = 1; j < 3; ++j) {
                int a = j + 1 + (i - 1) / 3 * 3;
                int b = 0;
                if (i % 3 == 0) {
                    b = 3;
                } else {
                    b = i % 3;
                }

                if (a > 9) {
                    break;
                }

                System.out.print(a + "*" + b + "=" + a * b + "   ");
            }

            System.out.println();
            if (i % 3 == 0) {
                System.out.println();
            }
        }

    }
}
