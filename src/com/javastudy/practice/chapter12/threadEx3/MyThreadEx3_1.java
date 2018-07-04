package com.javastudy.practice.chapter12.threadEx3;

public class MyThreadEx3_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
