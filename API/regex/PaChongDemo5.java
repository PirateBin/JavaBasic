package API.regex;

public class PaChongDemo5 {
    public static void main(String[] args) {
        //public String replaceAll(String regex,String newStr) 按照正则表达式的规则进行替换
        //public String[] split(String regex)  按照正则表达式的规则切割字符串

        /*
            张三sdasdaljwji23112李四aisdjali21lsakd王五
            要求1：把字符串中三个名字之间的字母替换为vs
            要求2：把字符串中的三个名字切割出来
         */

        String s="张三sdasdaljwji23112李四aisdjali21lsakd王五";

        //需求1：
        //方法在底层跟之前一样会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就用第二个参数去替换
        String result1=s.replaceAll("[\\w&&[^_]]+","vs");
        System.out.println(result1);


        //需求2：
        String[] arr=s.split("[\\w&&[^_]]+");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
