package API.regex;

public class PaChongDemo7 {
    public static void main(String[] args) {

        /*
        将字符串：我要学学编编编编编程程程程程程程
        替换为：我要学编程
         */

        String str="我要学学编编编编编程程程程程程程";

        //学学  学
        //编编编编编  编
        //程程程程程程程  程

        //(.)把重复内容的第一个字符看成一组
        //  \\1+表示把第一组的内容再拿出来使用1次或多次
        // $1表示再次使用正则表达式第一组的内容
        String result=str.replaceAll("(.)\\1+","$1");
        System.out.println(result);

    }
}
