package API.date.JDK8Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {

        /*
            static ZonedDateTime now()  //获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx()   //获取指定时间的ZonedDateTime对象
            ZonedDateTime WITHxXX(时间)   //修改时间系列的方法
            ZonedDateTime minusXxx(时间)  //减少时间
            ZonedDateTime plusXxx(时间)   //增加时间

         */


        //获取当前时间对象（带时区）
        ZonedDateTime zdt= ZonedDateTime.now();
        System.out.println(zdt);

        //获取指定的时间对象（带时区）
        //年月时分秒纳秒方式指定
        ZonedDateTime time1=ZonedDateTime.of(2023,10,1,11,
                12,12,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        //通过Instant+时区的方式获取时间对象
        Instant instant=Instant.ofEpochMilli(0L);
        ZoneId zoneId=ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2=ZonedDateTime.ofInstant(instant,zoneId);
        System.out.println(time2);

        //withXxx 修改时间系列的方法
        ZonedDateTime time3=time2.withYear(2000);
        System.out.println(time3);

        //减少或者增加时间
        ZonedDateTime time4=time3.minusYears(1);
        ZonedDateTime time5=time3.plusYears(1);
        System.out.println(time4);
        System.out.println(time5);


        //JDK8增的时间对象都是不可变的
        //如果我们修改了时间
        //那么调用者是不会改变的，而是产生了一个新的时间


    }
}
