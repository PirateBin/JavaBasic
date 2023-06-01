package io.converStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {

        /*
            利用转换流按照指定字符编码读取
            D:\java\FileTest\gbkfile.txt

            字节流读入，转成字符流
         */

        //1.创建对象并指定字符编码
        //第一个参数表示字节输入流的文件
        //第二个参数表示编码格式
        InputStreamReader isr=new InputStreamReader(
                new FileInputStream("D:\\java\\FileTest\\gbkfile.txt"),"GBK");

        //2.读取数据
        int ch;
        while((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }
        System.out.println();

        //3.关闭流
        isr.close();


        //JDK11之后的方法
        //字符流中第二个参数可以指定字符编码
        FileReader fr=new FileReader("D:\\java\\FileTest\\gbkfile.txt", Charset.forName("GBK"));
        int len;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }
        fr.close();

    }
}
