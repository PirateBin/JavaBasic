package io.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {

        /*
            演示：字节输出流FileOutputStream
            需求：写出一段文字到本地文件中（暂时不写中文）

            步骤：
                1.创建对象
                    细节1：参数是字符串表示的路径或者是File对象都可以
                    细节2：如果文件不存在，那么会创建一个新的文件，但是要保证父级路径是存在的
                    细节3：如果文件已经存在，则会清空文件
                2.写出数据
                    细节：write方法的参数是整数，但是实际写道本地文件中的是整数再ASCII上对应的字符
                    97 --> a
                    100 --> d
                3.释放资源
                    每次使用完流之后都要释放资源
         */

        //本地文件  File
        //开辟程序到文件的通道
        FileOutputStream fos=new FileOutputStream("a.txt");
        //写出数据
        fos.write(57);
        fos.write(55);
        //释放资源
        fos.close();

    }
}
