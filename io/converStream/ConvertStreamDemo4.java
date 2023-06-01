package io.converStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {

        /*
            利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
         */

        //FileInputStream fis=new FileInputStream("copy");
        //InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
        //BufferedReader br=new BufferedReader(isr);


        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("copy"),"UTF-8"));

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();

    }
}
