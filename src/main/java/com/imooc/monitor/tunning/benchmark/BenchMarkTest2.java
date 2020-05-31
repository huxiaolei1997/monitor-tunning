package com.imooc.monitor.tunning.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * http://hg.openjdk.java.net/code-tools/jmh/file/b6f87aa2a687/jmh-samples/src/main/java/org/openjdk/jmh/samples/JMHSample_02_BenchmarkModes.java
 * @date 2020年05月31日 14:55 胡晓磊 Exp $
 */
public class BenchMarkTest2 {
    @Benchmark
    public void hello() {

    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(BenchMarkTest2.class.getSimpleName()).forks(2).build();
        new Runner(options).run();
    }
}
