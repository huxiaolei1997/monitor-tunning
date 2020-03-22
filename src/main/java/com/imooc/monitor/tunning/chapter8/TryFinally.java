package com.imooc.monitor.tunning.chapter8;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年03月21日 14:10 胡晓磊 Exp $
 */
public class TryFinally {
    public static String f1(String[] args) {
        String str = "hello";
        try {
            return str;
        } finally {
            str = "imooc";
        }
    }
}
