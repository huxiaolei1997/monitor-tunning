package com.imooc.monitor.tunning.mat;

public class C {
    private static C myC = new C();
    public static C getInstance() {
        return myC;
    }
    private D d1 = new D();
    private E e1 = new E();
}
