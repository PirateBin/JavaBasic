package io.test;

import java.io.*;

public class Test7 {
    public static void main(String[] args) throws IOException {

        /*
            验证程序运行次数的小程序
         */

        //1.把文件中的数字读取到内存中
        BufferedReader br=new BufferedReader(new FileReader("count.txt"));
        String line=br.readLine();

        int count=Integer.parseInt(line);

        br.close();

        count++;

        //2.判断
        //<=3 正常运行
        //>3 程序停止
        if(count<=3){
            System.out.println("欢迎使用本软件，第"+count+"次使用免费");
        }else{
            System.out.println("本软件只能免费使用三次，欢迎您注册会员后继续使用");
        }

        //细节：
        //不能把输出流和输入流一起创建
        //如果输出流和输入流关联相同的文件，输出流会清空文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("count.txt"));
        bw.write(String.valueOf(count));

        bw.close();


    }
}
