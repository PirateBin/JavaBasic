package io.charStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            一：创建对象
                public FileWriter(File file)                            创建字符输出流关联本地文件
                public FileWriter(String pathname)                      创建字符输出流关联本地文件
                public FileWriter(File file,boolean append)             创建字符输出流关联本地文件，第二个参数表示是否打开续写
                public FileWriter(String pathname,boolean append)       创建字符输出流关联本地文件，第二个参数表示是否打开续写

            二：读取数据
                void write(int c)                           写出一个字符
                void write(String str)                      写出一个字符串
                void write(String str,int off,int len)      写出一个字符串的一部分
                void write(char[] cbuf)                     写出一个字符数组
                void write(char[] cbuf,int off,int len)     写出一个字符数组的一部分

            三：释放资源
                public void close()            释放资源
         */

        FileWriter fw=new FileWriter("a.txt",true);

        //fw.write(25105);
        char[] chars={'a','b','c','云'};
        fw.write(chars);

        fw.close();

    }
}
