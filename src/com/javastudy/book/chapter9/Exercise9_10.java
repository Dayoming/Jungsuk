package com.javastudy.book.chapter9;

public class Exercise9_10 {

    public static String format(String str, int length, int alignment) {
        if (length < str.length()) {
            str = str.substring(0, length);
            return str;
        }

        char changeChar[] = str.toCharArray();
        char strChar[] = new char[length];
        for (int i = 0; i < strChar.length; i++) strChar[i] = ' ';

        if (alignment == 0) {
            System.arraycopy(changeChar, 0, strChar, 0, changeChar.length);
        } else if (alignment == 1) {
            System.arraycopy(changeChar, 0, strChar, 2, changeChar.length);
        } else if (alignment == 2) {
            System.arraycopy(changeChar, 0, strChar, 4, changeChar.length);
        }

        return new String(strChar);

    }

    public static void main (String[]args){
        String str = "가나다";

        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
    }
}