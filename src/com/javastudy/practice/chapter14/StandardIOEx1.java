package com.javastudy.practice.chapter14;

public class StandardIOEx1 {
    public static void main(String[] args) {
        try {
            int input = 0;

            while((input = System.in.read()) != -1) {
                System.out.println("Input :" + input + ", (char)input :" + (char)input);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
