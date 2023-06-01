package io.integrateTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
            又一个文件里面存储了班级的同学信息，每一个信息占一行
            格式为：张三-男-23
            要求通过程序实现随机点名器
         */

        //1.读取文件信息
        BufferedReader br=new BufferedReader(new FileReader(new File("D:\\java\\FileTest\\name.txt")));

        //2.把文件信息存储起来
        ArrayList<String> list=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            list.add(line);
        }
        //System.out.println(list);
        br.close();

        //3.实现点名
        Collections.shuffle(list);
        System.out.println(list.get(0));


    }
}
