package API.date.JDK8Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateDemo {
    public static void main(String[] args) {

        //获取当前时间的日历对象（包含年月日）
        LocalDate nowDate= LocalDate.now();
        System.out.println(nowDate);    //2023-04-04

        //获取指定的时间的日历对象
        LocalDate ldDate=LocalDate.of(2023,1,1);
        System.out.println("指定日期："+ldDate); //指定日期：2023-01-01

        //get方法获取日历中的每一个属性值
        //获取年
        int year=ldDate.getYear();
        System.out.println(year);   //2023

        //获取月
        Month m=ldDate.getMonth();
        System.out.println(m);  //JANUARY
        System.out.println(m.getValue());  //获取数字的月  1

        //获取日
        System.out.println(ldDate.getDayOfMonth()); //1

        //获取星期
        DayOfWeek dayOfWeek=ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);  //SUNDAY
        System.out.println(dayOfWeek.getValue()); //获取星期的数字  7

        //is开头的方法表示判断
        System.out.println(ldDate.isBefore(nowDate));   //true
        System.out.println(ldDate.isAfter(nowDate));    //false

        //with开头的方法表示修改，只能修改年月日
        LocalDate withLocalDate=ldDate.withYear(2000);
        System.out.println(withLocalDate);  //2000-01-01

        //minus/plus 开头的方式表示减少/增加，只能对年月日修改
        System.out.println(ldDate.minusYears(1));   //2022-01-01  对年修改
        System.out.println(ldDate.plusMonths(2));   //2023-03-01    对月修改


        //判断今天是否是你的生日
        LocalDate birthday=LocalDate.of(2002,1,14);
        LocalDate daynow=LocalDate.now();

        //判断今年的月日是否和你的出生月日相同
        //MonthDay 表示月日对象
        MonthDay birMd=MonthDay.of(birthday.getMonthValue(),birthday.getDayOfMonth());
        MonthDay nowMd=MonthDay.from(daynow);

        System.out.println("今天是你生日吗"+birMd.equals(nowMd));  //今天是你生日吗false

    }
}
