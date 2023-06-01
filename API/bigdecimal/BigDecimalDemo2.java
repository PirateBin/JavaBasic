package API.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {

        /*
        不精确的构造方式
        1.直接创建对象
        BigDecimal bd1=new BigDecimal(0.01);
        BigDecimal bd2=new BigDecimal(0.09);

        System.out.println(bd1);  //0.01000000000000000020816681711721685132943093776702880859375
        System.out.println(bd2);  //0.0899999999999999966693309261245303787291049957275390625

         */

        //2.通过传递字符串表示的小数来创建对象  (精确)
        BigDecimal bd3=new BigDecimal("0.01");
        BigDecimal bd4=new BigDecimal("0.09");
        BigDecimal bd5=bd3.multiply(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);

        //3.通过静态方法获取对象
        BigDecimal bd6=BigDecimal.valueOf(0.001);
        System.out.println(bd6);

        //细节：
        //如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        //如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
        //如果传递的是[0,10]之间的整数，那么方法会返回已经创建好的对象，不会再重新new
        BigDecimal bd7=BigDecimal.valueOf(5);
        BigDecimal bd8=BigDecimal.valueOf(5);
        System.out.println(bd7==bd8);
    }
}
