package io.charStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("b.txt");
        fr.read();  //会把文件中的数据读取到缓冲区中

        //清空文件
        FileWriter fw=new FileWriter("b.txt");

        //请问，如果我再次使用fr读取数据
        //会读取到数据吗

        //正确答案：
        //会读取缓冲区内的数据，但是无法再次读取到文件中剩余的数据

        int len;
        while((len=fr.read())!=-1){
            System.out.println((char)len);
        }


        fw.close();
        fr.close();


    }
}
