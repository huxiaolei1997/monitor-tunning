package com.imooc.monitor.tunning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月20日 12:34 胡晓磊 Exp $
 */
@BTrace
public class PrintOnThrow {
    // store current exception in a thread local
    // variable (@TLS annotation). Note that we can't
    // store it in global variable !
    @TLS
    static Throwable currentException;

    // introduce probe into every constructor of java.lang.Throwable
    // class and store "this" in the thread local variable
    @OnMethod(clazz = "java.lang.Throwable", method = "<init>")
    public static void onthrow(@Self Throwable self) { // 拦截 new Throwable()
        currentException = self;
    }


    @OnMethod(clazz = "java.lang.Throwable", method = "<init>")
    public static void onthrow1(@Self Throwable self, String s) { // 拦截 new Throwable(String msg)
        currentException = self;
    }


    @OnMethod(clazz = "java.lang.Throwable", method = "<init>")
    public static void onthrow1(@Self Throwable self, String s, Throwable cause) { // 拦截 new Throwable(String msg, Throwable cause)
        currentException = self;
    }

    @OnMethod(clazz = "java.lang.Throwable", method = "<init>")
    public static void onthrow1(@Self Throwable self, Throwable cause) { // 拦截 new Throwable(Throwable cause)
        currentException = self;
    }


    @OnMethod(clazz = "java.lang.Throwable",
            method = "<init>",
            location = @Location(Kind.RETURN))
    public static void onthrowreturn() {
        if (currentException != null) {
            BTraceUtils.Threads.jstack(currentException);
            BTraceUtils.println("=====================");
            currentException = null;
        }
    }

}
