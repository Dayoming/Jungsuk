package com.javastudy.book.chapter11;

import java.util.*;

class Student3 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student3(String name, int ban, int no, int kor, int eng, int math) {
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
}

class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

public class Exercise11_7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Student3("홍길동", 1, 1, 100, 100, 100));
        list.add(new Student3("남궁성", 1, 2, 90, 70, 80));
        list.add(new Student3("김자바", 1, 3, 80, 80, 90));
        list.add(new Student3("이자바", 1, 4, 70, 90, 70));
        list.add(new Student3("안자바", 1, 5, 60, 100, 80));

        Collections.sort(list, new BanNoAscending());

        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
        }

}
