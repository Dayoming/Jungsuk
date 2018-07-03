package com.javastudy.book.chapter11.Exercise11_8;

public class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total;          // 총점
    int schoolRank;     // 전교등수

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


    /**
     * compareTo는 인스턴스 메서드기 때문에 this와 전달받은 인자를 비교하면 된다.
     * this로 호출 가능!
     * @param o
     * @return
     */
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
                ", " + schoolRank;
    }
}

