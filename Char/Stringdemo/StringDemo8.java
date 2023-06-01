package Char.Stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        String result=reverse(str);
        System.out.println(result);

    }

    public static String reverse(String str){
        //abc
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            char c=str.charAt(i);
            result=result+c;
        }
        return result;
    }
}
