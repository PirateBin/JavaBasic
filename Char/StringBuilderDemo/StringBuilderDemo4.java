package Char.StringBuilderDemo;

public class StringBuilderDemo4 {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();

        //添加字符串
        /*sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");*/

        //链式编程
        sb.append("aaa").append("bbb").append("ccc");

        System.out.println(sb);

        //再把StringBuilder变回字符串
        String str=sb.toString();
        System.out.println(str);

    }
}
