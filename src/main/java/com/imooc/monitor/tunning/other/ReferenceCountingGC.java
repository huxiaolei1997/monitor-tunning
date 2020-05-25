package com.imooc.monitor.tunning.other;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年05月25日 20:57 胡晓磊 Exp $
 */
public class ReferenceCountingGC {
    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    /**
     * 这个成员属性的意义是占点内存，方便在GC日志中看清楚该对象是否被回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }
}
