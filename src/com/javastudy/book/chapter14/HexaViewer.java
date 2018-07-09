package com.javastudy.book.chapter14;

import java.io.FileInputStream;
import java.io.PrintStream;

public class HexaViewer {
    public static void main(String[] args) {
        String fileName = args[0];
        try {
            FileInputStream fi = new FileInputStream(fileName);
            PrintStream ps = new PrintStream(System.out);

            int data = 0;
            int idx = 0;

            while((data = fi.read()) != -1) {
                ps.printf("%02X ", data);
                idx += 1;
                if (idx == 16) {
                    ps.printf("\n");
                    idx = 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
