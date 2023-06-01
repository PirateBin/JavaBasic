package API.date.JDK8Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        LocalDateTime nowDateTime= LocalDateTime.now();
        System.out.println(nowDateTime);

        //星期
        System.out.println(nowDateTime.getDayOfWeek());
        //月份
        System.out.println(nowDateTime.getMonth());


        //把LocalDateTime对象转化为LocalDate或者LocalTime对象
        LocalDate ld= nowDateTime.toLocalDate();
        LocalTime lt=nowDateTime.toLocalTime();
        System.out.println(ld);
        System.out.println(lt);

    }
}
