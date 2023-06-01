package Char.Stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1=sc.next();  //abc
        String str2="abc";
        //用==比较，两者会相同吗
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        //结论
        //以后只想要比较字符串的内容，就必须要用String中的方法
    }
}
