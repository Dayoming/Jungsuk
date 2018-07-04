package com.javastudy.practice.chapter12.threadEx1;

public class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
            // 조상인 Thread와 getName() 호출
        }
    }
}
