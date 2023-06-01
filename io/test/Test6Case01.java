package io.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test6Case01 {
    public static void main(String[] args) throws IOException {

        /*
            把出师表的文章顺序进行恢复到一个新文件中
         */

        //1.读数据
        BufferedReader br = new BufferedReader(new FileReader("csb.txt"));
        ArrayList<String> list=new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        //2.排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1=Integer.parseInt(o1.split("\\.")[0]);
                int i2=Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;
            }
        });

        //3.写出
        BufferedWriter bw=new BufferedWriter(new FileWriter("copy.txt"));
        for(String s:list){
            bw.write(s);
            //换行
            bw.newLine();
        }
        bw.close();


    }
}
