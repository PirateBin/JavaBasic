package io.test;

import java.io.*;
import java.util.*;

public class Test6Case02 {
    public static void main(String[] args) throws IOException {

        /*
            把出师表的文章顺序进行恢复到一个新文件中
         */

        //1.读数据+排序
        BufferedReader br = new BufferedReader(new FileReader("csb.txt"));
        TreeMap<Integer,String> map=new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            map.put(Integer.parseInt(line.split("\\.")[0]),line.split("\\.")[1]);
        }
        //System.out.println(map);

        br.close();



        //2.写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String> e:entries){
            Integer key=e.getKey();
            String value=e.getValue();
            bw.write(key+value);
            bw.newLine();
        }
        bw.close();
    }
}
