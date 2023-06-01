package Char.Stringdemo;

public class StringDemo2 {
    public static void main(String [] args){
        //创建两个字符串对象
        String s1=new String("Abc");
        String s2="abc";

        //==号比较
        //基本数据类型，比较的是数据值
        //引用数据类型，比的是地址值
        System.out.println(s1==s2);

        //比较字符串对象中你给内容是否相等
        boolean result1=s1.equals(s2);
        System.out.println(result1);

        //比较字符串对象中的内容是否相等，忽略大小写
        //只能忽略英文的大小写
        boolean result2=s1.equalsIgnoreCase(s2);
        System.out.println(result2);
    }
}
