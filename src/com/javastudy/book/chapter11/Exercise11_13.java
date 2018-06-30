package com.javastudy.book.chapter11;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Exercise11_13 {
    public static void main(String[] args) throws Exception {
        SutdaDeck2 deck = new SutdaDeck2();

        deck.shuffle();

        Player2[] pArr = {
                new Player2("타짜", deck.pick(), deck.pick()),
                new Player2("고수", deck.pick(), deck.pick()),
                new Player2("물주", deck.pick(), deck.pick()),
                new Player2("중수", deck.pick(), deck.pick()),
                new Player2("하수", deck.pick(), deck.pick())
        };

        TreeMap rank = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        for (int i = 0; i < pArr.length; i++) {
            Player2 p = pArr[i];
            rank.put(p, deck.getPoint(p));
            System.out.println(p + " " + deck.getPoint(p));
        }

        System.out.println();
        System.out.println("1위는 " + rank.firstKey() + "입니다.");

    }
}

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard5[] cards = new SutdaCard5[CARD_NUM];

    int pos = 0;
    HashMap jokbo = new HashMap();

    SutdaDeck2() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard5(num, isKwang);
        }
        registerJokbo();
    }

    void registerJokbo() {
        /* (1) 아래의 로직에 맞게 코드를 작성하시오.
         * 1. jokbo(HashMap)에 족보를 저장한다.
         *    두 카드의 값을 문자열로 붙여서 key로, 점수를 value로 저장한다. */
    }

    int getPoint(Player2 p) {
        if (p == null) return 0;

        SutdaCard5 c1 = p.c1;
        SutdaCard5 c2 = p.c2;

        Integer result = 0;

        /* (2) 아래의 로직에 맞게 코드를 작성하시오.
         * 1. 카드 두 장이 모두 광이면, jokbo에서 키를 "KK"로 해서 점수를 조회한다.
         * 2. 두 카드의 숫자(num)로 jokbo에서 등급을 조회한다.
         * 3. 해당하는 등급이 없으면, 아래의 공식으로 점수를 계산한다.
         *    (c1.num + c2.num) % 10 + 1000
         * 4. Player의 점수(point)에 계산한 값을 저장한다. */

        return result.intValue();

    }

    SutdaCard5 pick() throws Exception {
        SutdaCard5 c = null;

        if (0 <= pos && pos < CARD_NUM) {
            c = cards[pos];
            cards[pos++] = null;
        } else {
            throw new Exception("남아있는 카드가 없습니다.");
        }

        return c;

    }

    void shuffle() {
        for (int x = 0; x < CARD_NUM * 2; x++) {
            int i = (int) (Math.random() * CARD_NUM);
            int j = (int) (Math.random() * CARD_NUM);

            SutdaCard5 tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;

        }
    }
}

class Player2 {
    String name;
    SutdaCard5 c1;
    SutdaCard5 c2;

    int point;

    Player2(String name, SutdaCard5 c1, SutdaCard5 c2) {
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "[" + name + "]" + c1.toString() + "," + c2.toString();
    }
}

class SutdaCard6 {
    int num;
    boolean isKwang;

    SutdaCard6() {
        this(1, true);
    }

    SutdaCard6(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + ( isKwang ? "K" : "");
    }
}
