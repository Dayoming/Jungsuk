package com.javastudy.practice.chapter11;

import java.util.Vector;

public class VectorEx_01 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // 빈 공간을 없앤다.
        System.out.println("===== After trimToSize() =====");
        print(v);

        v.ensureCapacity(6); // 용량이 최소한 6이 되도록 함
        System.out.println("===== After ensureCapacity() =====");
        print(v);

        v.setSize(7);
        System.out.println("===== After setSize() =====");
        print(v); // capacity가 부족할 경우 자동으로 2배 증가

        v.clear();
        System.out.println("===== After clear() =====");
        print(v);

    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}
