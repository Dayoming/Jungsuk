package com.javastudy.book.chapter7;

/*
문제 7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실 한번 값이 지정되면 변경되어서는 안되는 값이다.
카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이 될 수도 있기 때문이다.
이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시오.
*/

class SutdaCard3 {
    final int NUM; //지역변수일 경우 선언 즉시 초기화, 아니면 생성자
    final boolean ISKWANG;

    SutdaCard3() {
        this(1, true);
    }

    SutdaCard3(int num, boolean isKwang) {
        this.NUM = num;
        this.ISKWANG = isKwang;
    }

    public String toString() {
        return NUM + ( ISKWANG ? "K" : "" );
    }
}

public class Exercise7_14 {
    public static void main(String[] args)
    {
        SutdaCard3 card = new SutdaCard3(1, true);
    }
}
