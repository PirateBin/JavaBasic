package io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {

        /*
            为了保证文件的安全性，必须对原始文件进行加密存储，再使用的时候在对其进行解密处理

            加密原理：
                对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中
            解密原理：
                读取加密后的文件，按照加密的规则进行反向操作，变成原始文件

            ^ :异或
                两边相同：false
                两边不同：true
                0：false
                1：true

         */

        //1.创建对象关联原始文件
        FileInputStream fis=new FileInputStream("image\\ency.jpg");
        //2.创建对象关联加密文件
        FileOutputStream fos=new FileOutputStream("image\\redu.jpg");

        //3.加密文件
        int len;
        byte[] bytes=new byte[1024*1024*5];
        while((len=fis.read(bytes))!=-1){

            //用异或对字节数组加密
            for(int i=0;i<bytes.length;i++){
                bytes[i]=(byte)(bytes[i]^2);
            }

            fos.write(bytes,0,len);
        }

        //4.释放资源
        fos.close();
        fis.close();



    }
}
