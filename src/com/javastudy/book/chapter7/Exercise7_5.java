package com.javastudy.book.chapter7;

/* 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게
바꾸어야 하는가? */

class Product {
    int price;
    int bonusPoint;

    Product() {

    }

    Product (int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv() { //Tv()가 super()를 호출

    }

    public String toString() {
        return "Tv";
    }
}

public class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
