package API.date.JDK7Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        /*

            public static Calendar getInstance() 获取当前时间的日历对象

            public final Date getTime  获取日期对象
            public final setTime(Date time)  给日历设置日期对象

            public long getTimeInMillis()  拿到时间毫秒值
            public void setTimeInMillis(long millis)  给日历设置时间毫秒值

            public int get(int filed)  取日期中的某个字段信息
            public void set(int field,int value)  修改日历中某个字段信息
            public void add(int field,int amount)  为某个字段增加/减少指定的值

         */

        //1.获取日历对象
        //Calendar 是一个抽象类，不能只能new，而是通过一个静态方法获取到子类对象
        //底层原理：根据系统的不同时期来获取不同的日历对象
        //会把时间中的纪元，年，月，日，时分秒，星期等等都放在一个数组中
        //月份范围：0~11 表示1~12月
        //星期日是代表一周的第一天

        Calendar c=Calendar.getInstance();
        System.out.println(c);

        //修改日历代表的时间
        Date d=new Date();
        c.setTime(d);
        System.out.println(c);

        long s=c.getTimeInMillis();
        System.out.println(s);


        //calendar是一个数组
        /*
        0:纪元
        1:年
        2:月
        3:一年中第几周
        4:一个月中第几周
        5:一个月中第几天
        ...
         */

        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;  //0是一月
        int date=c.get(Calendar.DAY_OF_MONTH);
        int week=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+","+month+","+date+","+getWeek(week));

        //修改字段
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,11);   //修改月份为12月
        int year2=c.get(Calendar.YEAR);
        int month2=c.get(Calendar.MONTH)+1;
        System.out.println(year2+","+month2);


        //调用方法在2023年4月3日增加一个月
        c.set(Calendar.YEAR,2023);
        c.set(Calendar.MONTH,4);
        c.set(Calendar.DAY_OF_WEEK,3);

        c.add(Calendar.MONTH,1);
        System.out.println(c.get(Calendar.YEAR)+"年,"+c.get(Calendar.MONTH)+"月,"+getWeek(c.get(Calendar.DAY_OF_WEEK)));
        // 2023,5,星期六




    }

    //查表法
    //传入1~7返回对应的星期
    public static String getWeek(int index) {
        //定义一个数组，让汉字星期几和1~7产生对应关系
        String[] arr={"","星期一","星期二","星球三","星期四","星期五","星期六","星期日"};
        return arr[index];
    }

}
