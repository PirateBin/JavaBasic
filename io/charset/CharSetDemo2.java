package io.charset;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharSetDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            字节流读取数据的适合会出现乱码，但是拷贝的适合为什么不会？
            因为拷贝是将每个字节拷贝到记事本，然后记事本与数据源的码表和编码格式一样，所以不会产生乱码

            不产生乱码：
                不要用字节流读取文本
                编码解码的时候使用同一个码表。同一个编码方式
         */

        FileInputStream fis=new FileInputStream("D:\\java\\FileTest\\Test\\c.txt");
        FileOutputStream fos=new FileOutputStream("copy.txt");

        int len;
        byte[] bytes=new byte[1024*1024*5];
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();


    }
}
