package com.imooc.monitor.tunning.chapter4;

import com.imooc.monitor.tunning.chapter2.User;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import java.lang.reflect.Field;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月20日 15:45 胡晓磊 Exp $
 */
@BTrace
public class PrintArgComplex {

    /**
     * btrace -cp "classpath,一般为classes路径，比如/Users/huxiaolei/IdeaProjects/monitor-tunning/target/classes" pid PrintArgComplex.java
     * @param pcn
     * @param pmn
     * @param user
     */
    @OnMethod(clazz = "com.imooc.monitor.tunning.chapter4.Ch4Controller",
            method = "arg2",
             location = @Location(Kind.ENTRY))
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, User user) {
        BTraceUtils.printFields(user);
        Field field2 = BTraceUtils.field("com.imooc.monitor.tunning.chapter2.User", "name");
        BTraceUtils.println(BTraceUtils.get(field2, user));
        BTraceUtils.println(pcn + "," + pmn);
        BTraceUtils.println();
    }
}
