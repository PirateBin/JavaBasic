package io.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        /*
            public int read(byte[] buffer)  一次读一个字节数组数据
         */

        FileInputStream fis=new FileInputStream("a.txt");

        byte[] bytes=new byte[3];
        //一次读取多个字节数据，根据数组长度有关
        //返回值表示本次读取到了多少字节数据

        int len=fis.read(bytes);
        System.out.println(len);        //3

        String str=new String(bytes);
        System.out.println(str);        //abc

        int len2=fis.read(bytes);
        System.out.println(len2);                   //2
        System.out.println(new String(bytes,0,len2));      //de

        int len3=fis.read();
        System.out.println(len3);                   //-1
        System.out.println(new String(bytes));      //dec

        fis.close();

    }
}
