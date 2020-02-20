package com.imooc.monitor.tunning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月19日 14:47 胡晓磊 Exp $
 */
@BTrace
public class PrintArgSimple {
    @OnMethod(
            clazz = "com.imooc.monitor.tunning.chapter4.Ch4Controller",
            method = "arg1",
            location = @Location(Kind.ENTRY))
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] args) {
        BTraceUtils.printArray(args);
        BTraceUtils.println(pcn + "," + pmn);
        BTraceUtils.println();
    }
}
