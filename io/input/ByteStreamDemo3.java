package io.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            字节输入流循环读取
         */

        FileInputStream fis = new FileInputStream("a.txt");

        //read()每次调用指针移动,所以需要定义一个变量接收read()
        int b;

        while (( b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        fis.close();
    }
}
