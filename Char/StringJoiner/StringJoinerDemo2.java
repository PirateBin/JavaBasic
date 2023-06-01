package Char.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //创建对象
        StringJoiner sj=new StringJoiner(",","[","]");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len=sj.length();
        System.out.println(len);  //13

        String str=sj.toString();

        System.out.println(str);

        System.out.println(sj);
    }
}
