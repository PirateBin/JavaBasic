package API.date.JDK8Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {

        /*
            static DateTimeFormatter ofPattern  获取格式对象
            String format(时间对象)   按照指定方式格式化

         */

        //获取时间对象
        ZonedDateTime time= Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");

        //格式化
        String t=dtf1.format(time);
        System.out.println(t);



    }
}
