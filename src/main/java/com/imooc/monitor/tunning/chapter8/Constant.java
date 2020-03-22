package com.imooc.monitor.tunning.chapter8;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年03月21日 14:14 胡晓磊 Exp $
 */
public class Constant {
    public static void f1() {
        final String x = "hello";
        final String y = x + "world";
        String z = x + y;
        System.out.println(z);
    }

    public static void f2() {
         final String x = "hello";
         String y = x + "world";
         String z = x + y;
        System.out.println(z);
    }
}
