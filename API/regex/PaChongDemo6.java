package API.regex;

public class PaChongDemo6 {
    public static void main(String[] args) {

        //分组是看(左括号，按(出现的顺序分为1，2，3~组

        //判断一个字符串的开始字符和结束字符是否一致，只考虑一个字符
        //举例： a123a  b456b  121731  &as8&  a234b(false)
        String regex1="(.).+\\1";   //   \\1表示把第一组的内容再使用一次
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("121731".matches(regex1));
        System.out.println("a234b".matches(regex1));   //false



        //判断一个字符串的开始部分和结束部分是否一致，考虑多个字符
        //举例： abc123abc   b456b  123789123  &!@abc&!@  abc123abd(false)
        String regex2="(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("121731".matches(regex2));
        System.out.println("abc123abd".matches(regex2));  //false



        //判断一个字符串的开始部分和结束部分是否一致，开始部分内部每个字符也需要一致
        //举例:  aaa123aaa  bbb456bbb  111789111   &&abc&&2

        String regex3="((.)\\2*).+\\1";  //(.)把首字母看做一组，\\2表示把首字母拿出来再次使用，*表示后面重复的内容可以出现0次或者多次
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&2".matches(regex3));  //false



    }
}
