package Char.Stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        //统计--计数器思想
        //定义三个计数器
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a'&&c<='z'){
                //char类型的变量在参与计算的时候自动类型提升为int 查询ASCII码表
                smallCount++;
            }else if(c>='A'&&c<='Z'){
                bigCount++;
            }else if(c>='0'&&c<='9'){
                numberCount++;
            }

        }
        System.out.println("小写字母有："+smallCount);
        System.out.println("大写字母有："+bigCount);
        System.out.println("数字字符有："+numberCount);
    }
}
