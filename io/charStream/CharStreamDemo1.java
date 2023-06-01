package io.charStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            public FileReader(File file)            创建字符输入流关联本地文本
            public FileReader(String pathname)      创建字符输入流关联本地文本

            public int read()                       读取数据，读到末尾返回-1
            public int read(char[] buffer)          读取多个数据，读到末尾返回-1

            public void close()                     释放资源/关流

         */

        FileReader fr=new FileReader("copy.txt");
        //FileReader fr=new FileReader(new File("copy.txt"));


        //字符流的底层也是字节流，默认也是一个字节一个字节读取的
        //如果遇到中文就会一次读取多个字节，GBK标准一次读取两个字节，UTF-8标准一次读取三个字节

        //read()细节
        //读取之后，方法的底层还会解码并转成十进制
        //如果想看到中文汉字，就要把这些十进制数字强转成char
        int len;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }

        fr.close();

    }
}
