package API.bigdecimal;

//public BigDecimal add(BigDecimal val)  加法
//public BigDecimal subtract(BigDecimal val)  减法
//public BigDecimal multiply(BigDecimal val)  乘法
//public BigDecimal divide(BigDecimal val)  除法
//public BigDecimal divide(BigDecimal val,精确几位，舍入模式) 除法

import java.math.BigDecimal;

public class BigDecimalDemo3 {
    public static void main(String[] args) {

        //加法
        BigDecimal bd1=BigDecimal.valueOf(10.0);
        BigDecimal bd2=BigDecimal.valueOf(4.0);
        BigDecimal bd3=bd1.add(bd2);
        System.out.println(bd3);

        //减法
        BigDecimal bd4=bd1.subtract(bd2);
        System.out.println(bd4);

        //乘法
        System.out.println(bd1.multiply(bd2));

        //除法
        BigDecimal bd5=bd1.divide(bd2,2,BigDecimal.ROUND_HALF_UP);  //四舍五入
        System.out.println(bd5);

    }
}
