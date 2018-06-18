package com.javastudy.practice.chapter10;

public class InnerEx_03 {
    private int outerIv = 0;
    static int outerCv = 0;

    class instanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class staticInner {
        //int iiv = outerIv;
        //인스턴스 변수 접근 불가능
        int iiv2 = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
