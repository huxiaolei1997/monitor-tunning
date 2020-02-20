package com.imooc.monitor.tunning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月20日 12:45 胡晓磊 Exp $
 */
@BTrace
public class PrintLine {
    @OnMethod(clazz = "com.imooc.monitor.tunning.chapter4.Ch4Controller",
            method = "exception",
            location = @Location(value = Kind.LINE, line = 45))
    public static void anyRead(@ProbeMethodName String pcn, @ProbeMethodName String pmn, int line) {
        // TODO
        BTraceUtils.println(pcn + "," + pmn + ", " + line);
        BTraceUtils.println();
    }

}
