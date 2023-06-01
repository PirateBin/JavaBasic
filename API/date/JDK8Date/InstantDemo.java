package API.date.JDK8Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        /*
            static Instant now() 获取当前时间的Instant对象（标准时间）
            static Instant ofXxxx(long epochMilli)  根据（秒/毫秒/纳秒）获取Instant对象
            ZonedDateTime atZone(ZoneId zone)  指定时区
            boolean isXxx(Instant otherInstant)  判断系列的方法
            Instant minusXxx(long millisToSubtract)  减少时间系列的方法
            Instant plusXxx(long millisToSubtract)  增加时间系列的方法
         */

        //获取当前时间的Instant对象（标准时间）
        Instant now= Instant.now();
        System.out.println(now);    //2023-04-04T07:31:39.912326Z

        //根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1=Instant.ofEpochMilli(0L);
        System.out.println(instant1);   //1970-01-01T00:00:00Z

        Instant instant2=Instant.ofEpochSecond(1l);
        System.out.println(instant2);   //1970-01-01T00:00:01Z

        Instant instant3=Instant.ofEpochSecond(1l,1000000000l);
        System.out.println(instant3);   //1970-01-01T00:00:02Z


        //指定时区
        ZonedDateTime time=Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);   //2023-04-04T15:31:39.916325800+08:00[Asia/Shanghai]

        //isXxx 判断
        Instant instant4=Instant.ofEpochMilli(0L);
        Instant instant5=Instant.ofEpochMilli(1000l);

        boolean result1=instant4.isBefore(instant5);   //判断instant4是否在instant5之前
        System.out.println(result1);    //true
        System.out.println(instant4.isAfter(instant5));  //判断instant4是否在instant5之后  false

        //
        Instant instant6=Instant.ofEpochMilli(3000L);
        System.out.println(instant6);   //1970-01-01T00:00:03Z

        Instant instant7=instant6.minusSeconds(1);  //在instant6的时间上减去1s
        System.out.println(instant7);   //1970-01-01T00:00:02Z

    }
}
