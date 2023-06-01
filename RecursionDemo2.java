package Algorithm.sort;

import java.math.BigInteger;

public class RecursionDemo2 {
    public static void main(String[] args) {

        //用递归求10！
        //方法内部再次调用方法的时候，参数必须要更加的靠近出口


        System.out.println(getFactorialRecursion(10));

    }


    public static int getFactorialRecursion(int number){
        if(number==1){
            return 1;
        }

        return number*getFactorialRecursion(number-1);

    }
}
