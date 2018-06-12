package com.javastudy.practice.chapter9;

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}

public class EqualsEx_01 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        // v1과 v2는 같지 않다. 서로 다른 주소값을 가지고 있기 때문!
        // 두 개 이상의 참조변수가 같은 주소값을 갖는 것으 가능(한 객체를 참조)

        if(v1.equals(v2)) {
            System.out.println("equals == true");
        } else {
            System.out.println("equals == false");
        }

        v2 = v1; // 같은 주소 참조

        if(v1.equals(v2)) {
            System.out.println("equals == true");
        } else {
            System.out.println("equals == false");
        }
    }
}
