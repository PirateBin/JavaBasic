package io.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo8 {
    public static void main(String[] args) {
        /*
            JDK7 IO流捕获异常的方法
         */

        int len;

        try(FileInputStream fis=new FileInputStream("D:\\java\\FileTest\\Test\\b.txt");
                FileOutputStream fos=new FileOutputStream("copy.txt")){

            byte[] bytes=new byte[1024*1024*5];

            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
