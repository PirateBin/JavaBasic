package API.date.JDK8Date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        //当前时间
        LocalDateTime today= LocalDateTime.now();
        System.out.println(today);

        //生日时间
        LocalDateTime birthday=LocalDateTime.of(2002,1,14,0,30,12);
        System.out.println(birthday);

        long year= ChronoUnit.YEARS.between(birthday,today);
        System.out.println(year);  //相差的年份
        System.out.println(ChronoUnit.MONTHS.between(birthday,today));  //相差的月份
        System.out.println(ChronoUnit.WEEKS.between(birthday,today));  //相差的周数
        System.out.println(ChronoUnit.DAYS.between(birthday,today));  //相差的天数
        System.out.println(ChronoUnit.HOURS.between(birthday,today));  //相差的小时数
        System.out.println(ChronoUnit.DECADES.between(birthday,today));  //相差的十年数

    }
}
