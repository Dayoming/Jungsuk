package com.javastudy.book.chapter9;

public class Exercise9_9 {

//    public static String delChar(String src, String delCh) {
//        StringBuffer sb = new StringBuffer(src.length());
//
//        return "";
//    }

    public static String delChar(String src, String delCh) {
        String changeStr = "";
        for (int i = 0; i < delCh.length(); i++) {
            if (src.indexOf(delCh.charAt(i)) != -1) {
                changeStr += src.charAt(i);
            }
        }
        return changeStr;
    }

    public static String delChar2(String src, String delCh) {
        //src를 delCh가 포함되어 있는지 검사한다.
        //만약 포함이 되어있으면 반환될 문자열에 더하지 않고 넘어간다.
        //안되어있으면 반환될 문자열에 더한다.
        String changeStr = "";
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (delCh.indexOf(ch) == -1) {
                changeStr += ch;
            }
        }
        return changeStr;
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " +
                delChar2("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1   2       3       4\t5)" + " -> " +
                delChar2("(1  2       3       4\t5)", " \t"));
    }
}
