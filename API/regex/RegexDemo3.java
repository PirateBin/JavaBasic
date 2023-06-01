package API.regex;

public class RegexDemo3 {
    public static void main(String[] args) {
        //预定义字符(只能匹配一个字符)
        //   \转义字符 改变后面那个字符原本的含义
        //   ""在Java中表示字符串的开头或者结尾
        System.out.println("\"");

        // .表示任意一个字符
        System.out.println("---1---");
        System.out.println("火".matches("."));  //true
        System.out.println("火影".matches(".."));  //true

        //  \\d 表示任意的一个数字
        System.out.println("---2---");
        System.out.println("3".matches("\\d"));  //true
        System.out.println("33".matches("\\d\\d"));  //true

        //  \\w只能是一位单词字符 [a-zA-Z_0-9]
        System.out.println("---3---");
        System.out.println("_".matches("\\w"));  //true
        System.out.println("g".matches("\\w"));  //true
        System.out.println("6".matches("\\w"));  //true

        //  非单词字符 \\W
        System.out.println("---4---");
        System.out.println("原".matches("\\W"));  //true
        System.out.println("原".matches("\\w"));  //false

        //校验多个字符
        /*
            X?      X出现1次或0次
            X*      X出现0次或多次
            X+      X出现一次或多次
            X{n}        X正好n次
            X{n,}       X至少n次
            X{n,m}      X至少n次，不超过m次
         */
        //必须是数字 字母 下划线 至少6位
        System.out.println("---5---");
        System.out.println("as314v".matches("\\w{6,}"));  //true
        System.out.println("as31".matches("\\w{6,}"));  //false

        // 必须是数字和字符 必须是4位
        System.out.println("---6---");
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}")); //true
        System.out.println("2h0k".matches("[\\w&&[^_]]{4}"));  //true
        System.out.println("2h_k".matches("[\\w&&[^_]]{4}"));  //false


    }
}
