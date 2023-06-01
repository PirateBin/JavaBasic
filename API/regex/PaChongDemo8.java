package API.regex;

public class PaChongDemo8 {
    public static void main(String[] args) {

        /*

        非捕获分组：分组之后不需要再使用本组数据，仅仅是把数据括起来
        ?:    ?=    ?!  都表示非捕获分组

         */

        //身份证号码的简易正则表达式
        //非捕获分组：仅仅是把数据括起来
        //特点：不占用组号
        String regex="[1-9]\\d{16}(?:\\d(?i)x)";

        System.out.println("41080119930228457x".matches(regex));

    }
}
