package io.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {

        /*
            练习：
                文件拷贝
                把D:\java\FileTest\Test\b.txt拷贝到当前模块下
         */

        //1.创建对象
        FileInputStream fis=new FileInputStream("D:\\java\\FileTest\\Test\\b.txt");
        FileOutputStream fos=new FileOutputStream("copy.txt");

        long start = System.currentTimeMillis();

        //2.拷贝
        int b;
        while((b=fis.read())!=-1){
            System.out.print((char)b);
            fos.write(b);
        }

        //3.先开的流最后关闭
        fos.close();
        fis.close();

        long over=System.currentTimeMillis();
        System.out.println(over-start);

    }
}
