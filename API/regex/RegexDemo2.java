package API.regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        //public boolean matches(String regex):判断是否与正则表达式匹配，匹配返回true

        //字符类（只能匹配一个字符）

        //只能出现abc，一个[]只能匹配一个字符
        System.out.println("---1---");
        System.out.println("a".matches("[abc]"));  //true
        System.out.println("ab".matches("[abc]"));  //false
        System.out.println("ab".matches("[abc][abc]"));  //true

        //不能出现abc
        System.out.println("---2---");
        System.out.println("a".matches("[^abc]"));  //false

        //a到z A到Z的范围
        System.out.println("---3---");
        System.out.println("a".matches("[a-zA-Z]"));  //true
        System.out.println("az".matches("[a-zA-Z][a-zA-Z]"));  //true
        System.out.println("0".matches("[a-zA-Z0-9]"));  //true

        //[a-d[m-p]]  a到d，或者m到p
        System.out.println("---4---");
        System.out.println("e".matches("[a-d[m-p]]"));  //false
        System.out.println("m".matches("[a-d[m-p]]"));  //true

        //[a-z&&[def]]  a-z和def的交集 为 d、e、f
        //细节：交集要写&& 而不能写& 写成&没有任何含义，只是一个&符号
        System.out.println("---5---");
        System.out.println("d".matches("[a-z&&[def]]")); //true
        System.out.println("t".matches("[a-z&&[def]]")); //false

        //[a-z&&[^bc]  a-z和非bc的交集
        System.out.println("---6---");
        System.out.println("a".matches("[a-z&&[^bc]]"));  //true
        System.out.println("b".matches("[a-z&&[^bc]]"));  //false

        //[a-z&&[^m-p] a到z和非（m到p）的交集
        System.out.println("---7---");
        System.out.println("a".matches("[a-z&&[^m-p]]"));  //true
        System.out.println("m".matches("[a-z&&[^m-p]]"));  //false



    }
}
