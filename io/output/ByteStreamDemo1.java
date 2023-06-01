package io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        /*
            演示：字节输出流FileOutputStream
            需求：写出一段文字到本地文件中（暂时不写中文）

            步骤：
                创建对象
                写出数据
                释放资源
         */

        //本地文件  File
        //开辟程序到文件的通道
        FileOutputStream fos=new FileOutputStream("a.txt");
        //写出数据
        fos.write(97);
        //释放资源
        fos.close();

    }
}
