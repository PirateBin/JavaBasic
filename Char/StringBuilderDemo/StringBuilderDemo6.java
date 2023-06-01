package Char.StringBuilderDemo;

//使用StringBuilder场景
//字符串的拼接
//字符串的反转

import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args){
        //对称

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();

        //反转键盘录入的字符串
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        sb.reverse();
        String result=sb.toString();

        //String result=new StringBuilder().append(str).reverse().toString();  链式编程
        System.out.println(result);

        if(result.equals(str)){
            System.out.println("当前字符串是对称字符串");
        }else{
            System.out.println("当前字符串不是对称字符串");
        }

    }
}
