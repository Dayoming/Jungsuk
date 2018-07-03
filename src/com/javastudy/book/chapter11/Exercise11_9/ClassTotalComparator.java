package com.javastudy.book.chapter11.Exercise11_9;

import java.util.Comparator;

public class ClassTotalComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        /*
         * (1) 알맞은 코드를 넣어 완성하시오.
         * */
        Student s = (Student) o1;
        Student s2 = (Student) o2;

        if (s.ban == s2.ban) {
            return s2.total - s.total;
        } else {
            return s.ban - s2.ban;
        }

    }
}
