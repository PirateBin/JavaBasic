package Char.Stringdemo;

public class StringDemo1 {

    public static void main(String [] args){
        String s1="abc";
        System.out.println(s1);

        //使用new方式获取一个字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s2=new String();
        System.out.println("@"+s2+"!");

        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3=new String("abc");
        System.out.println(s3);

        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：修改字符串内容， abc 改变成 Qbc
        //abc -->{'a','b','c'} -->{'Q','b','c'}-->"Qbc"
        char [] chs={'a','b','c','d'};
        String s4=new String(chs);
        System.out.println(s4);

        //传递一个字节数组，根据字节数组的内容创建一个新的字符串对象
        //应用场景：以后再网络当中传输的数据都是字节信息
        //我们一般把字节信息进行转换，转成字符串，此时需要用
        byte[] bytes={97,98,99,100};
        String s5=new String(bytes);
        System.out.println(s5);
    }
}


//基本数据类型：byte、short、int、long、float、double、char、boolean

//==对于基本数据类型比较的是具体数值；
//而对于引用数据类型比较的是地址值