package API.date.JDK8Date;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {

        //Duration 主要是侧重与时间的间隔

        //本地日期时间对象
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);

        //出生日期的对象
        LocalDateTime birthday=LocalDateTime.of(2002,1,14,0,00,00);
        System.out.println(birthday);

        Duration duration= Duration.between(birthday,today);
        System.out.println(duration);  //PT185996H54M30.8747798S

        System.out.println(duration.toDays());  //相差的天数
        System.out.println(duration.toHours()); //相差的小时数
        //toMinutes
        //toMillis
        //ToNanos

    }

}
