package io.charset;

import java.io.FileInputStream;
import java.io.IOException;

public class CharSetDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            字节流读取中文会出现乱码
         */

        FileInputStream fis=new FileInputStream("D:\\java\\FileTest\\Test\\c.txt");
        int b;

        while((b=fis.read())!=-1){
            System.out.print((char)b);
        }

        fis.close();


        //unicode字符集
        //UTF-8 是unicode字符集的一种编码格式

    }
}
