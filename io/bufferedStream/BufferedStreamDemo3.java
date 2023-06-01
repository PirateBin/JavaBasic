package io.bufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            字符缓冲输入流：
                构造方法：
                    public BufferedReader(Reader r)
                特有方法：
                    public String readLine()    读一整行
         */

        BufferedReader br=new BufferedReader(new FileReader("b.txt"));

        //readLine方法在读取的时候，一次读一整行，遇到回车换行结束
        //但是他不会把回车换行读到内存中

        /*
        String line1=br.readLine();
        System.out.println(line1);

        String line2=br.readLine();
        System.out.println(line2);

         */

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();


    }
}
