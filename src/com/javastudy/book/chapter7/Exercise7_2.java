package com.javastudy.book.chapter7;

/*
문제 7-1의 SutdaDeck 클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
1. 메서드명 : shuffle
   기    능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다. (Math.ramdom() 사용)
   반환타입 : 없음
   매개변수 : 없음

2. 메서드명 : pick
   기    능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
   반환타입 : SutdaCard
   매개변수 : int index - 위치

3. 메서드명 : pick
   기    능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다. (Math.random() 사용)
   반환타입 : SutdaCard
   매개변수 : 없음

결과
1K
7
2, 6, 10, 1K, 7, 3, 10, 5, 7, 8, 5, 1, 2, 9, 6, 9, 4, 8K, 4, 3K,
2
*/

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang;
            if (i < 10 && (num == 1 || num == 3 || num == 8)) {
                isKwang = true;
            } else {
                isKwang = false;
            }
            cards[i] = new SutdaCard2(num, isKwang);
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int a = (int)(Math.random() * cards.length);
            int b = (int)(Math.random() * cards.length);

            SutdaCard2 temp = cards[a];
            cards[a] = cards[b];
            cards[b] = temp;
        }
    }

    public SutdaCard2 pick(int i) {
        return cards[i];
    }

    public SutdaCard2 pick() {
        int randomInt = (int)(Math.random() * cards.length);
        return pick(randomInt);
    }

    /* (1) 위에 정의된 세 개의 메서드를 작성하시오. */

} //SutdaDeck

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K" : "" );
    }
}

public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i=0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }

        System.out.println();
        System.out.println(deck.pick(0));

    }
}
