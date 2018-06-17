package com.javastudy.book.chapter9;

public class Exercise9_11 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            for(int i = a; i <= b; i++) {
               for (int j = 1; j < 10; j++) {
                   System.out.println(i + "*" + j + "=" + i*j);
               }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("USAGE : GugudanTest 3 5");
        }
    }
}
