package API.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChongDemo3 {
    public static void main(String[] args) {
        /*
        Java自从95年问世以来，经历了很多版本，目前企业用的最多的是Java8和Java11，
        因为这两个是长期支持版本，下一个长期支持版本是Java17，相信再未来不就Java17也回逐渐登上历史舞台
        需求1：爬取版本号尾8，11，17的Java文本，只要Java，不显示文本号
        需求2：爬取版本号为8，11，17的Java文本
        需求3：爬取除了版本号为8，11，17的Java文本

        */

        String s="JAVA自从95年问世以来，经历了很多版本，目前企业用的最多的是java8和Java11，\n" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信再未来不就Java17也回逐渐登上历史舞台";

        //需求1：
        //定义正则表达式
        String regex1="((?i)Java)(?=8|11|17)";   //?理解为前面的数据Java  =表示在Java后面跟随的数据  但是在获取的时候只获取前半部分
        Pattern p= Pattern.compile(regex1);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }


        //需求2：
        //String regex2="((?i)Java)(8|11|17)";
        String regex2="((?i)Java)(?:8|11|17)";  //:表示为后面跟随的部分 但在获取的时候截取后面部分
        Pattern p2=Pattern.compile(regex2);
        Matcher m2=p2.matcher(s);
        while(m2.find()){
            System.out.println(m2.group());
        }

        //需求3：
        String regex3="((?i)Java)(?!8|11|17)";   //!表示后面带有的部分不截取
        Pattern p3=Pattern.compile(regex3);
        Matcher m3=p3.matcher(s);
        while(m3.find()){
            System.out.println(m3.group());
        }
    }
}
