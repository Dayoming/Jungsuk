package com.javastudy.practice.chapter9;

public class HashCodeEx_01 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2)); // str1과 str2는 다른 객체

    }
}
