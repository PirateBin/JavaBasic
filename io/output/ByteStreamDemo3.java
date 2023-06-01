package io.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            void write(int b)                           一次写一个字节数据
            void write(byte[] b)                        一次写一个字节数组
            void write(byte[] b,int off,int len)        一次写一个字节数组的部分数据
            参数一：
                数组
            参数二：
                起始索引
            参数三：
                个数
         */

        FileOutputStream fos = new FileOutputStream("a.txt");

        //fos.write(97);
        //fos.write(98);

        /*
        byte[] bytes = {97, 98, 99, 100, 101};
        fos.write(bytes);

         */

        byte[] bytes = {97, 98, 99, 100, 101};

        fos.write(bytes,1,3);


        fos.close();

    }
}
