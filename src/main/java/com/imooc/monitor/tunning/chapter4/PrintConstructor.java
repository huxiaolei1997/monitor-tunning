package com.imooc.monitor.tunning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月20日 12:14 胡晓磊 Exp $
 */
@BTrace
public class PrintConstructor {
    @OnMethod(clazz = "com.imooc.monitor.tunning.chapter2.User", method = "<init>")
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] args) {
        BTraceUtils.println(pcn + "," + pmn);
        BTraceUtils.printArray(args);
        BTraceUtils.println();
    }
}
