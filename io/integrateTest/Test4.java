package io.integrateTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args) throws IOException {

        /*
            实现点名器，男生70%概率点到，女生30%概率
         */

        //1.读取文件信息
        BufferedReader br=new BufferedReader(new FileReader(new File("D:\\java\\FileTest\\name.txt")));

        //2.把数据存储
        ArrayList<String> boylist=new ArrayList<>();
        ArrayList<String> girllist=new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            String sex=line.split("-")[1];
            if(sex.equals("男")){
                boylist.add(line);
            }else if(sex.equals("女")){
                girllist.add(line);
            }
        }

        br.close();

        //System.out.println(boylist);
        //System.out.println(girllist);

        //3.实现点名
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        int i=0;
        int boycount=0;
        int girlcount=0;
        while(i<100){
            Collections.shuffle(list);
            if(list.get(0)==1){
                Collections.shuffle(boylist);
                System.out.println(boylist.get(0));
                i++;
                boycount++;
            }else if(list.get(0)==0){
                Collections.shuffle(girllist);
                System.out.println(girllist.get(0));
                i++;
                girlcount++;
            }
        }
        System.out.println(boycount+"  "+girlcount);

    }
}
