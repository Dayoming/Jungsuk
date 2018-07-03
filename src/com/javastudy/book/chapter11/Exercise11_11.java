package com.javastudy.book.chapter11;

/* 다음은 SutdaCard 클래스를 HashSet에 저장하고 출력하고 예제이다.
 * HashSet에 중복된 카드가 저장되지 않도록 SutdaCard의 hashCode()를 알맞게 오버라이딩 하시오. */

import java.util.HashSet;

class SutdaCard4 {
    int num;
    boolean isKwang;

    SutdaCard4() {
        this(1, true);
    }

    SutdaCard4(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SutdaCard4) {
            SutdaCard4 c = (SutdaCard4)obj;
            return num==c.num && isKwang == c.isKwang;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return num + ( isKwang ? "K" : "");
    }

    // 객체를 구별하기 위해 고유한 정수값으로 출력시켜주는 메소드
    // reference 주소를 반환
    // equals 메서드를 오버라이딩 하면 hashCode 메서드도 오버라이딩 해줘야 함
    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}

public class Exercise11_11 {
    public static void main(String[] args) {
        SutdaCard4 c1 = new SutdaCard4(3, true);
        SutdaCard4 c2 = new SutdaCard4(3, true);
        SutdaCard4 c3 = new SutdaCard4(1, true);

        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println(set);
    }

}
