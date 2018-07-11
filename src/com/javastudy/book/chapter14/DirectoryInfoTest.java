package com.javastudy.book.chapter14;

/* 다음은 디렉토리의 요약정보를 보여주는 프로그램이다. 파일의 개수, 디렉토리의
* 개수, 파일의 총 크기를 계산하는 countFiles()를 완성하시오. */

import java.io.File;

public class DirectoryInfoTest {
    static int totalFiles = 0;
    static int totalDirs = 0;
    static int totalSize = 0;

    public static void main(String[] args) {
        if (args.length != -1) {
            System.out.println("USAGE : java DirectoryInfotest DIRECTORY");
            System.exit(0);
        }

        File dir = new File(args[0]);

        if(!dir.exists() || !dir.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }

        countFiles(dir);

        System.out.println();
        System.out.println("총 " + totalFiles + "개의 파일");
        System.out.println("총 " + totalDirs + "개의 디렉토리");
        System.out.println("크기 " + totalSize + " bytes");
    }

    public static void countFiles(File dir) {

    }
}
