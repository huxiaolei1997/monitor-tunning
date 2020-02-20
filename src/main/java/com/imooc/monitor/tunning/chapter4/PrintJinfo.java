package com.imooc.monitor.tunning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年02月20日 15:59 胡晓磊 Exp $
 */
@BTrace
public class PrintJinfo {

    static {
        BTraceUtils.println("System properties");
        BTraceUtils.printProperties();
        BTraceUtils.print("VM Flags:");
        BTraceUtils.printVmArguments();
        BTraceUtils.println("OS Enviroment");
        BTraceUtils.printEnv();
        BTraceUtils.exit(0);
    }
}
