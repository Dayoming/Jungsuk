package com.javastudy.book.chapter11;

import java.util.ArrayList;

public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();
        ArrayList cha = new ArrayList();
        ArrayList hap = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ArrayList kyoTemp = new ArrayList(list1);
        kyoTemp.retainAll(list2);
        kyo.addAll(kyoTemp);

        ArrayList hapTemp = new ArrayList(list1);
        hapTemp.removeAll(kyo);
        hapTemp.addAll(list2);
        hap.addAll(hapTemp);

        ArrayList chaTemp = new ArrayList(hap);
        chaTemp.removeAll(list2);
        cha.addAll(chaTemp);

        System.out.println("list1=" + list1);
        System.out.println("list2=" + list2);
        System.out.println("kyo=" + kyo);
        System.out.println("cha=" + cha);
        System.out.println("hap=" + hap);

    }
}
