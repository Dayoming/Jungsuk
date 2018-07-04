package com.javastudy.practice.chapter12.threadEx1;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1(); // 직접 상속

        Runnable r = new ThreadEx1_2(); // 인터페이스 구현
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

    }
}