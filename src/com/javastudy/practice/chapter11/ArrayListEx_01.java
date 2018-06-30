package com.javastudy.practice.chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx_01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // fromindex부터 toindex사이에 저장된 객체 반환
        System.out.println(list1);
        System.out.println(list2);

        System.out.println();

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println();

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        System.out.println();

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        System.out.println(list2);

        System.out.println();

        list2.set(3, "AA");
        System.out.println(list2);

        System.out.println();

        // list1에서 list2와 겹치는 부분만 남기고 삭제한다.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        System.out.println(list1);

        System.out.println();

        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }

        System.out.println(list1);
        System.out.println(list2);

        System.out.println();

    }
}