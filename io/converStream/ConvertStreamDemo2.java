package io.converStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码写出
         */

        //1.创建转换流的对象
        OutputStreamWriter osw=new OutputStreamWriter(
                new FileOutputStream("copy.txt"),"GBK");

        //2.输出数据
        osw.write("天青色等烟雨");

        //3.释放资源
        osw.close();


        //JDK11之后
        FileWriter fw=new FileWriter("copy.txt", Charset.forName("GBK"));
        fw.write("而我在等你");
        fw.close();

    }
}
