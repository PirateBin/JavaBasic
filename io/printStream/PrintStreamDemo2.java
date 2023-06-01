package io.printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            字符打印流：
                构造方法：
                    public PrintWriter(Writer/File/String)                            关联字节输出流/文件/文件路径
                    public PrintWriter(String fileName,Charset charset)                     指定字符编码
                    public PrintWriter(Writer,boolean autoFlush)                   自动刷新
                    public PrintWriter(Writer out,boolean autoFlush,String encoding)  指定字符编码

                成员方法：
                    public void write(int b)                        常规方法：规则和之前一样，将指定的字节写出
                    public void println(Xxx xx)                     特有方法：打印任意数据，自动刷新，自动换行
                    public void print(Xxx xx)                       特有方法：打印任意数据，不换行
                    public void printf(String format,Object...args) 特有方法：带占位符的打印语句，不换行

         */

        //1.创建字符打印流
        PrintWriter pw=new PrintWriter(new FileWriter("a.txt"),true);

        //2.写出数据
        pw.println("天青色等烟雨");
        pw.print("而我在等你");
        pw.println();
        pw.printf("%s袅袅%s","炊烟","升起");

        //3.释放资源
        pw.close();

    }
}
