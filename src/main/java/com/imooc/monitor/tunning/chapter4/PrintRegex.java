package com.imooc.monitor.tunning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月20日 15:56 胡晓磊 Exp $
 */
@BTrace
public class PrintRegex {
    /**
     * 拦截controller里面所有的方法
     * @param pcn
     * @param pmn
     */
    @OnMethod(clazz = "com.imooc.monitor.tunning.chapter4.Ch4Controller",
            method = "/.*/")
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn) {
        BTraceUtils.println(pcn + "," + pmn);
        BTraceUtils.println();
    }
}
