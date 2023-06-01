package API.packeging.test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //判断任意一个年份是闰年还是平年
        //一年366天或者2月份是29天是闰年
        //用JDK7和JDK8的方式判断


        //JDK7
        //把时间设置为一年的3月1日
        //再把日历往前减1天，判断是28号还是29号4
        Calendar c= Calendar.getInstance();
        c.set(2000,2,1);  //2000年3月1日
        //把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        //后一年的1月1号
        //往前减一天，判断是366天还是365天
        Calendar c1=Calendar.getInstance();
        c.set(2001,0,1);  //2001年1月1日
        //把日期往前减一天
        c.add(Calendar.DAY_OF_YEAR,-1);
        int day2=c.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);


        //JDK8
        //月份范围1~12
        LocalDate day3=LocalDate.of(2000,3,1);
        //往前减1天
        LocalDate day4=day3.minusDays(1);
        //获取这天是一个月中的几号
        int day5=day4.getDayOfMonth();
        System.out.println(day5);

        //true闰年
        //false平年
        System.out.println(day3.isLeapYear());



    }
}
