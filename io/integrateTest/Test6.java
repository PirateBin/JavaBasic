package io.integrateTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test6 {
    public static void main(String[] args) throws IOException {

        /*
            随机点名
            如果班级中所有学生都点完了，开启第二轮点名
            第二轮点名不需要手动操作，要求程序自动开启第二轮点名

            核心思想：
               点一个删一个，把删除的备份，全部点完时还原数据。
         */

        //1.获取学生文件
        String src="D:\\java\\FileTest\\name.txt";

        //2.定义变量，表示备份文件，一开始文件为空
        String backups="D:\\java\\FileTest\\namecopy.txt";

        //3.读取初始文件中数据，把学生信息添加到集合中
        ArrayList<String> list=readFile(src);

        //4.判断集合是否含有数据
        if(list.size()==0){
            //如果没有数据，说明已经读取完毕，从备份文件中还原数据
            //读取备份文件
            list=readFile(backups);

            //把文件写入初始文件
            writeFile(src,list,false);

            //删除备份文件
            new File(backups).delete();
        }

        //5.如果集合中有数据，表示还没有点完，点一个删一个，把删除的备份到backups文件中
        Collections.shuffle(list);
        String stuInfo=list.remove(0);
        System.out.println("当前被点到的学生为:" + stuInfo);
        //把删除之后的所有学生信息，写到初始文件中
        writeFile(src,list,false);
        //把删除的学生信息备份（追加写入）
        writeFile(backups,stuInfo,true);



    }


    //文件读取
    public static ArrayList<String> readFile(String src) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(new File(src)));

        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        br.close();
        return list;
    }

    //把数据写入初始文件中
    public static void writeFile(String src,ArrayList<String> list,boolean Append) throws IOException{
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File(src),Append));
        for(String s:list){
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

    //把删除的学生信息写入backups文件中
    public static void writeFile(String backups,String stuInfo,boolean Append) throws  IOException{
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File(backups),Append));
        bw.write(stuInfo);
        bw.newLine();
        bw.close();
    }

}
