package Thread.test.test3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyThread extends Thread{

    //共享数据
    static BigDecimal money=BigDecimal.valueOf(100);
    static int count=3;

    //最小的中奖金额
    static final BigDecimal MIN=BigDecimal.valueOf(0.01);

    @Override
    public void run(){

        synchronized(MyThread.class){
            if(count==0){
                System.out.println(getName()+"没有抢到红包!");
            }else{
                BigDecimal prize;

                if(count==1){
                    //表示此时是最后一个红包
                    prize=money;
                }else {
                    //表示第一次和第二次抽红包（随机）
                    Random r = new Random();
                    //能随机到的最大金额 double bounds=money-(count-1)*MIN;
                    double bounds = money.subtract(BigDecimal.valueOf(count - 1).multiply(MIN)).doubleValue();
                    //prize=r.nextDouble(bounds);
                    prize = BigDecimal.valueOf(r.nextDouble(bounds));
                }

                //设置prize精确为2位小数,四舍五入
                prize=prize.setScale(2, RoundingMode.HALF_UP);
                //从money中去掉当前中将的金额
                money=money.subtract(prize);
                //红包个数-1
                count--;
                //将本次的红包信息打印
                System.out.println(getName()+"抢到了"+prize+"块");
            }

        }
    }

}
