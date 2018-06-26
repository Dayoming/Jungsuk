package com.javastudy.book.chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet set = new HashSet(list); // 3, 6, 2, 7
        TreeSet tset = new TreeSet(set);
        // 이진검색트리이므로 작은 수부터 -> 쪽으로 정렬
        // 2, 3, 6, 7

        Stack stack = new Stack();
        stack.addAll(tset); // TreeSet이 들어가있음

        while(!stack.empty())
            System.out.println(stack.pop());
        // 비어있지 않으면 처음 나가는 순서부터 찍는다(후입 선출이므로 7, 6, 3, 2)
    }
}
