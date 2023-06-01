package io.integrateTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args) throws IOException {

        /*
            点名器
            第三次点名必是某某某
         */

        //1.获取学生文件
        BufferedReader br=new BufferedReader(new FileReader(new File("D:\\java\\FileTest\\name.txt")));

        //2.存储学生信息
        ArrayList<String> list=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            list.add(line);
        }
        br.close();



        //3.获取计数器中的次数
        BufferedReader brr=new BufferedReader(new FileReader(new File("count.txt")));
        int count=Integer.parseInt(brr.readLine());

        count++;

        if(count!=3){
            Collections.shuffle(list);
            System.out.println(list.get(0));
        }else {
            System.out.println("张三");
        }
        brr.close();


        //4.把定数器写入文件

        BufferedWriter bww=new BufferedWriter(new FileWriter(new File("count.txt")));
        bww.write(count+"");
        bww.close();

    }
}
