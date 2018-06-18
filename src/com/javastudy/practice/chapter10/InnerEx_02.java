package com.javastudy.practice.chapter10;

public class InnerEx_02 {
    class InstanceInner { }
    static class StaticInner { }

    InstanceInner iv = new InstanceInner();
    StaticInner cv = new StaticInner();

    static void StaticMethod() {
        //InstanceInner obj1 = new InstanceInner();
        //클래스 메서드에서 인스턴스 클래스 접근 불가능
        StaticInner obj2 = new StaticInner();

        InnerEx_02 outer = new InnerEx_02();
        InstanceInner obj1 = outer.new InstanceInner();
        //선언 하려면 위와 같은 방식으로 사용(외부 클래스를 먼저 선언)
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        //LocalInner iv = new LocalInner();
        //인스턴스 메소드에선 인스턴스, 클래스 모두 접근 가능하나 지역 클래스는 접근 불가능
    }

    void myMethod() {
        class LocalInner { }
        LocalInner lv = new LocalInner();
    }
}
