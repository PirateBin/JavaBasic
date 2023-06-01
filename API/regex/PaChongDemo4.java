package API.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChongDemo4 {
    public static void main(String[] args) {

        /*
        只写+和*表示贪婪匹配
        +？ 非贪婪匹配
        *？ 非贪婪匹配

         */

        String s="Java自从95年问世以来，abbbbbbbbbbaaaaaaaaaaaaaaaaaaaa" +
                "经历了很多版本，目前企业用的最多的是Java8和Java11，\n" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信再未来不就Java17也回逐渐登上历史舞台";

        String regex="ab+";  //贪婪爬取
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }

    }
}
