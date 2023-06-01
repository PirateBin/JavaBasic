package API.date.JDK7Date;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {

        OnyearPast();


        //定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后


        Random r=new Random();

        //创建两个时间对象
        Date d1=new Date(Math.abs(r.nextInt()));  //int类型会自动转化为long类型
        Date d2=new Date(Math.abs(r.nextInt()));

        if(d1.getTime()>=d2.getTime()){
            System.out.println(d1);
        }else {
            System.out.println(d2);
        }


    }

    private static void OnyearPast() {
        //打印时间原点开始一年之后的时间
        //创建一个对象表示时间原点
        Date d1=new Date(0L);
        System.out.println(d1);

        //获取d1时间的毫秒值
        long time=d1.getTime();

        //在此基础上加上1年的毫秒值
        time=time+1000l*60*60*24*365;

        //把计算之后的时间毫秒值设置回d1中
        d1.setTime(time);

        //打印出d1时间
        System.out.println(d1);
    }
}
