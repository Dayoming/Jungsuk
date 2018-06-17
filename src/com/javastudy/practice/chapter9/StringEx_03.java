package com.javastudy.practice.chapter9;

public class StringEx_03 {
    public static void main(String[] args) {
        String s1 = "AAA";
        String s2 = new String("AAA");

        if (s1 == s2) {
            System.out.println("s1==s2 ? true");
        } else {
            System.out.println("s1==s2 ? false");
        }

        s2 = s2.intern();
        System.out.println("s2에 intern()을 호출한 후");
        //intern()은 String 인스턴스의 문자열을 'constant pool'에 등록하는 일을 함
        //등록하고자 하는 문자열이 이미 존재하면 그 문자열의 주소값 반환

        if (s1 == s2) {
            System.out.println("s1==s2 ? true");
        } else {
            System.out.println("s1==s2 ? false");
        }
    }
}
