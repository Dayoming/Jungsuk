package com.javastudy.book.chapter9;

public class Exercise9_3 {
    public static void main(String[] args) {
        String fullpath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        int index = fullpath.lastIndexOf("\\");
//        System.out.println(index);
        path = fullpath.substring(0, index);
        fileName = fullpath.substring(index + 1, fullpath.length());

        System.out.println("fullPath:" + fullpath);
        System.out.println("path:" + path);
        System.out.println("fileName:" + fileName);
    }
}
