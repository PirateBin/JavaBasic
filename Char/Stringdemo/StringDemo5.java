package Char.Stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String [] args){
        //键盘录入一个字符串并进行遍历
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //进行遍历
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            System.out.println(c);
        }

    }
}
