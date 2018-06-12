package com.javastudy.practice.chapter9;

/* equals 오버라이딩 예제 */

class Person {
    long id;

    Person(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Person) { // obj가 null이 아니고 Person의 인스턴스이면
            return id == ((Person)obj).id; // ?
        } else {
            return false;
        }
    }
}

public class EqualsEx_02 {
    public static void main(String[] args) {
        Person p1 = new Person(8602192222111L);
        Person p2 = new Person(8602192222111L);

        if(p1 == p2) {
            System.out.println("eqauls == true");
        } else {
            System.out.println("eqauls == false");
        }

        if(p1.equals(p2)) {
            System.out.println("eqauls == true");
        } else {
            System.out.println("eqauls == false");
        }
    }
}
