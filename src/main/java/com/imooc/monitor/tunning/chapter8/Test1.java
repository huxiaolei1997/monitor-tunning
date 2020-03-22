package com.imooc.monitor.tunning.chapter8;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年03月21日 13:35 胡晓磊 Exp $
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println(c);
    }

    /**
     * Test1的字节码文件
     *
     * Classfile /Users/huxiaolei/IdeaProjects/monitor-tunning/target/classes/com/imooc/monitor/tunning/chapter8/Test1.class
     *   Last modified 2020-3-21; size 649 bytes
     *   MD5 checksum 6405ca28ff725ed7bc79ae83c94904b1
     *   Compiled from "Test1.java"
     * public class com.imooc.monitor.tunning.chapter8.Test1
     *   minor version: 0
     *   major version: 52
     *   flags: ACC_PUBLIC, ACC_SUPER
     * Constant pool:
     *    #1 = Methodref          #5.#24         // java/lang/Object."<init>":()V
     *    #2 = Fieldref           #25.#26        // java/lang/System.out:Ljava/io/PrintStream;
     *    #3 = Methodref          #27.#28        // java/io/PrintStream.println:(I)V
     *    #4 = Class              #29            // com/imooc/monitor/tunning/chapter8/Test1
     *    #5 = Class              #30            // java/lang/Object
     *    #6 = Utf8               <init>
     *    #7 = Utf8               ()V
     *    #8 = Utf8               Code
     *    #9 = Utf8               LineNumberTable
     *   #10 = Utf8               LocalVariableTable
     *   #11 = Utf8               this
     *   #12 = Utf8               Lcom/imooc/monitor/tunning/chapter8/Test1;
     *   #13 = Utf8               main
     *   #14 = Utf8               ([Ljava/lang/String;)V
     *   #15 = Utf8               args
     *   #16 = Utf8               [Ljava/lang/String;
     *   #17 = Utf8               a
     *   #18 = Utf8               I
     *   #19 = Utf8               b
     *   #20 = Utf8               c
     *   #21 = Utf8               MethodParameters
     *   #22 = Utf8               SourceFile
     *   #23 = Utf8               Test1.java
     *   #24 = NameAndType        #6:#7          // "<init>":()V
     *   #25 = Class              #31            // java/lang/System
     *   #26 = NameAndType        #32:#33        // out:Ljava/io/PrintStream;
     *   #27 = Class              #34            // java/io/PrintStream
     *   #28 = NameAndType        #35:#36        // println:(I)V
     *   #29 = Utf8               com/imooc/monitor/tunning/chapter8/Test1
     *   #30 = Utf8               java/lang/Object
     *   #31 = Utf8               java/lang/System
     *   #32 = Utf8               out
     *   #33 = Utf8               Ljava/io/PrintStream;
     *   #34 = Utf8               java/io/PrintStream
     *   #35 = Utf8               println
     *   #36 = Utf8               (I)V
     * {
     *   public com.imooc.monitor.tunning.chapter8.Test1();
     *     descriptor: ()V
     *     flags: ACC_PUBLIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: aload_0
     *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     *          4: return
     *       LineNumberTable:
     *         line 10: 0
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0       5     0  this   Lcom/imooc/monitor/tunning/chapter8/Test1;
     *
     *   public static void main(java.lang.String[]);
     *     descriptor: ([Ljava/lang/String;)V
     *     flags: ACC_PUBLIC, ACC_STATIC
     *     Code:
     *       操作数栈的深度2
     *       本地变量表最大长度（slot为单位），64位的是2，其它是1，索引从0开始，如果是非static方法索引0代表this，后面是入参，
     *       1个参数，实例方法多一个this参数
     *       stack=2, locals=4, args_size=1
     *          0: iconst_2 # 常量2压栈
     *          1: istore_1 # 出栈保存到本地变量1里面
     *          2: iconst_3 # 常量3压栈
     *          3: istore_2 # 出栈保存到本地变量2里面
     *          4: iload_1  # 局部变量1压栈
     *          5: iload_2  # 局部变量2压栈
     *          6: iadd     # 栈顶两个元素相加，计算结果压栈
     *          7: istore_3 # 出栈保存到局部变量3里面
     *          8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *         11: iload_3
     *         12: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
     *         15: return
     *       LineNumberTable:
     *         line 12: 0
     *         line 13: 2
     *         line 14: 4
     *         line 15: 8
     *         line 16: 15
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0      16     0  args   [Ljava/lang/String;
     *             2      14     1     a   I
     *             4      12     2     b   I
     *             8       8     3     c   I
     *     MethodParameters:
     *       Name                           Flags
     *       args
     * }
     * SourceFile: "Test1.java"
     */
}
