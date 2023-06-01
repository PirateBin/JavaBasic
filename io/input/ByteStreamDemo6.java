package io.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        /*
            把D:\java\FileTest\Test\b.txt 拷贝到当前模块下

         */

        //1.创建输入输出流对象
        FileInputStream fis = new FileInputStream("D:\\java\\FileTest\\RiskManagement.mp4");
        FileOutputStream fos = new FileOutputStream("copy.mp4");

        long start=System.currentTimeMillis();

        //2.拷贝
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while((len=fis.read(bytes))!=-1){
            //从0索引开始写入len长度的数据
            fos.write(bytes,0,len);
        }


        //3.释放资源
        fos.close();
        fis.close();

        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
