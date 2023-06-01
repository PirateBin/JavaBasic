package API.bigintegerd;

import java.math.BigInteger;
import java.util.Random;
/*
public BigInteger(int num,Random rnd) 获取随机大整数，范围：[0~2的num次方-1]
public BigInteger(String val) 获取指定的大整数
public BigInteger(String val,int radix) 获取指定进制的大整数

public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象，内部有优化

对象一旦创建内部的数据不能发生改变

 */
public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //获取一个随机的大整数
        Random r=new Random();

        for(int i=0;i<10;i++){
            BigInteger bd=new BigInteger(4,r);
            System.out.println(bd);
        }

        //获取一个指定的大整数
        BigInteger bd2=new BigInteger("100");
        System.out.println(bd2);

        //获取指定进制的大整数
        BigInteger bd3=new BigInteger("100010101001",2);  //2217  val是二进制
        System.out.println(bd3);

        //静态方法获取BigInteger的对象
        BigInteger bd4=BigInteger.valueOf(9223372036854775807L);  //只能在long取值范围之内，小于等于9223372036854775807
        System.out.println(bd4);

        System.out.println(Long.MAX_VALUE);

        //在内部对常用数字：-16~16进行了优化
        //提前把-16~16先创建好BigInteger的对象，如果多次获取就不会重写创建新的
        BigInteger bd5=BigInteger.valueOf(12);
        BigInteger bd6=BigInteger.valueOf(12);

        System.out.println(bd5==bd6); //true
    }
}
