package com.imooc.monitor.tunning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月20日 12:14 胡晓磊 Exp $
 */
@BTrace
public class PrintReturn {
    @OnMethod(clazz = "com.imooc.monitor.tunning.chapter4.Ch4Controller",
            method = "arg1",
            location = @Location(Kind.RETURN))
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, @Return AnyType result) {
        BTraceUtils.println(pcn + "," + pmn + "," + result);
        BTraceUtils.println();
    }
}
