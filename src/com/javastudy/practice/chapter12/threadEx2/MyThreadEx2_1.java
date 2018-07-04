package com.javastudy.practice.chapter12.threadEx2;

public class MyThreadEx2_1 extends Thread {
    @Override
    public void run() {
        throwsException();
    }

    public void throwsException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
