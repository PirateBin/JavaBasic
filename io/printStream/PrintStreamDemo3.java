package io.printStream;

import java.io.PrintStream;

public class PrintStreamDemo3 {
    public static void main(String[] args) {

        /*
            获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机粗行家，默认指向控制台
            特殊的打印流，系统中的标准输出流，这个流不能关闭，在系统中是唯一的
         */

        PrintStream ps=System.out;
        ps.println("123");

        System.out.println("123");

    }
}
