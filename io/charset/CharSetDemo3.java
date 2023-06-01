package io.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        /*
            Java编码的方式：
                public byte[] getByte()                         使用默认方式编码
                public byte[] getBytes(String charsetName)      使用指定方式编码

            Java解码的方式
                String(byte[] bytes)                            使用默认方式解码
                String(byte[] bytes,String charsetName)         使用指定方式解码
         */

        //编码
        String str="天青色等烟雨";
        byte[] bytes1=str.getBytes();  //utf-8  一个英文1个字节  一个中文3个字节
        System.out.println(Arrays.toString(bytes1)); //[-27, -92, -87, -23, -99, -110, -24, -119, -78, -25, -83, -119, -25, -125, -97, -23, -101, -88]

        byte[] bytes2=str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2)); //[-52, -20, -57, -32, -55, -85, -75, -56, -47, -52, -45, -22]

        //解码
        String str2=new String(bytes1);
        System.out.println(str2);   //天青色等烟雨

        String str3=new String(bytes1,"GBK");
        System.out.println(str3);   //澶╅潚鑹茬瓑鐑熼洦   乱码

    }
}
