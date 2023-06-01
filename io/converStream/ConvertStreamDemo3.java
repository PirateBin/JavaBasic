package io.converStream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            将本地文件中的GBK文件，转成UTF-8
         */

        /*

        //1.把GBK文件读入
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\java\\FileTest\\gbkfile.txt"),"GBK");
        int ch;
        ArrayList<String> list=new ArrayList<>();
        while((ch=isr.read())!=-1){
            list.add(ch+"");
        }
        isr.close();

        //2.转成UTF-8转出
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\java\\FileTest\\gbkfile.txt"),"UTF-8");
        for(String s:list){
            osw.write(Integer.parseInt(s));
        }
        osw.close();

         */


        //JKD11之后
        FileReader fr=new FileReader("D:\\java\\FileTest\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw=new FileWriter("copy",Charset.forName("UTF-8"));
        int len;
        while((len=fr.read())!=-1){
            fw.write(len);
        }
        fw.close();
        fr.close();

    }
}
