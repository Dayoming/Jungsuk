package com.javastudy.book.chapter11;

/* 다음의 코드는 성적평균의 범위별로 학생 수를 세기 위한 것이다. TreeSet이 학생들의 평균을
* 기준으로 정렬하도록 compare(Object o1, Object o2)와 평균점수의 범위를 주면 해당 범위에 속한
* 학생의 수를 반환하는 getGroupCount()를 완성하라. */

import java.util.*;

class Student2 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name
                + ", " + ban
                + ", " + no
                + ", " + kor
                + ", " + eng
                + ", " + math
                + ", " + getTotal()
                + ", " + getAverage();
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student2) {
            Student2 tmp = (Student2) o;

            return name.compareTo(tmp.name);
        } else {
            return -1;
        }
    }
}

public class Exercise11_6 {
    static int getGroupCount(TreeSet tset, int from, int to) {
        Student2 fromStu = new Student2("", 0, 0, from, from, from);
        Student2 toStu = new Student2("", 0, 0, to, to, to);

        Set set = tset.subSet(fromStu, toStu);

        return set.size();
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2)
            {
                Student2 s = (Student2)o1;
                Student2 s2 = (Student2)o2;

                int result = (int)(s.getAverage() - s2.getAverage());
//                int result = (int)(s2.getAverage() - s.getAverage());
                return result;

            }
        });

        set.add(new Student2("홍길동", 1, 1, 100, 100, 100));
        set.add(new Student2("남궁성", 1, 2, 90, 70, 80));
        set.add(new Student2("김자바", 1, 3, 80, 80, 90));
        set.add(new Student2("이자바", 1, 4, 70, 90, 70));
        set.add(new Student2("안자바", 1, 5, 60, 100, 80));

        Iterator it = set.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        System.out.println();

        System.out.println("[60~69] : " + getGroupCount(set, 60, 70));
        System.out.println("[70~79] : " + getGroupCount(set, 70, 80));
        System.out.println("[80~89] : " + getGroupCount(set, 80, 90));
        System.out.println("[90~100] : " + getGroupCount(set, 90, 101));
    }

}
