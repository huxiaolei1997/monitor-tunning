package com.imooc.monitor.tunning.chapter8;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年03月21日 14:05 胡晓磊 Exp $
 */
public class StringAdd {
    public static void f1(String[] args) {
        String src = "";
        for (int i = 0; i < 10; i++) {
            // 每一次循环都会new一个StringBuilder
            src = src + "A";
        }
        System.out.println(src);
    }

    public static void f2(String[] args) {
        // 只需要new一个StringBuilder
        StringBuilder src = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            // 每一次循环都会new一个StringBuilder
            src.append("A");
        }
        System.out.println(src);
    }
}
