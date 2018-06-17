package com.javastudy.book.chapter9;

public class Exercise9_4 {
    static void printGraph(int[] dataArr, char ch) {
        for (int i = 0; i < dataArr.length; i++) { // 0, 1, 2, 3
            for (int j = 0; j < dataArr[i]; j++) { // 0 ~ 2, 0 ~ 6, 0, 0 ~ 3
                System.out.print(ch);
            }
            System.out.print(dataArr[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printGraph(new int[]{3, 7, 1, 4}, '*');
    }
}
