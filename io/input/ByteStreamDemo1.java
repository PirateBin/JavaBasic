package io.input;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            字节输入流FileInputStream
         */

        FileInputStream fis=new FileInputStream("a.txt");

        int b1=fis.read();
        System.out.println((char)b1);

        fis.close();

    }
}
