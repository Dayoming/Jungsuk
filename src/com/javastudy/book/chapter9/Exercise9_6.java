package com.javastudy.book.chapter9;

public class Exercise9_6 {
    public static String fillZero(String src, int length) {
        if (src == null || src.length() == length) {
            return src;
        }

        if (length <= 0) {
            return "";
        }

        if (src.length() > length) {
            return src.substring(0, length);
        }

        char fillsrc[] = new char[length];

        String fillsrcStr;
        for (int i = 0; i < fillsrc.length; i++) {
            fillsrc[i] = '0';
        }

        return "";
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}
