package API.packeging.integer;

public class IntegerDemo4 {
    public static void main(String[] args) {

        //把整数转成二进制
        String str1=Integer.toBinaryString(100);
        System.out.println(str1);  //1100100

        //把整数转成八进制
        String str2=Integer.toOctalString(100);
        System.out.println(str2);   //144

        //把整数转化成十六进制
        String str3=Integer.toHexString(100);
        System.out.println(str3);   //64

        //把字符串类型转成int类型的整数
        //强类型语言：没中数据在java中都有各自的数据类型
        //在计算的时候，如果不是同一种数据类型，无法进行计算

        int i=Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i+1);  //124
        //类型转换的时候，括号中只能是数字，否则代码会报错
        //8种包装类种，除了Character都有parseXxx的方法，进行类型转换

        String str="true";
        boolean b=Boolean.parseBoolean(str);
        System.out.println(b);




    }
}
