package com.javastudy.book.chapter11.Exercise11_9;

public class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total;          // 총점
    int schoolRank;     // 전교등수
    int classRank;      // 반등수

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    @Override
    public int compareTo(Object o) {
        /*
         * (1) 알맞은 코드를 넣어 완성하시오.
         * */
        if (o instanceof Student) {
            Student s = (Student) o;
            return s.total - this.total;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name +
                ", " + ban +
                ", " + no +
                ", " + kor +
                ", " + eng +
                ", " + math +
                ", " + getTotal() +
                ", " + getAverage() +
                ", " + schoolRank +
                ", " + classRank;
    }
}
