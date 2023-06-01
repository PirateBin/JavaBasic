package API.regex;

/*
    需求:把下面文本中的座机电话，邮箱，手机号，热线都爬取出来。
            手机号:18512516757，18512534907
            或者联系邮箱:boniu@white.cn，melgly@gmail.com
            座机电话:01036517895，010-98951256
            热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090

            手机号的正则表达式：1[3-9]\d{9}
            邮箱的正则表达式： \w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}{1,2}
            座机号码的正则表达式： 0\d{2,3}-?[1-9]\d{4,9}
            热线电话的正则表达式： 400-?[1-9]\d{2}-?[1-9]\d{3}

 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChongDemo2 {
    public static void main(String[] args) {

        String s = "手机号:18512516757，18512534907\n" +
                "或者联系邮箱:boniu@white.cn，melgly@gmail.com\n" +
                "座机电话:01036517895，010-98951256\n" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";

        //System.out.println("400-618-9090".matches("400-?[1-9]\\d{2}-?[1-9]\\d{3}"));

        String regex="(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|(0\\d{2,3}-?[1-9]\\d{4,9})" +
                "|(400-?[1-9]\\d{2}-?[1-9]\\d{3})";

        //获取正则表达式对象
        Pattern p=Pattern.compile(regex);

        //获取文本匹配器的对象
        Matcher m=p.matcher(s);

        //利用循环获取每一个数据
        while(m.find()){
            String str=m.group();
            System.out.println(str);
        }
    }
}
