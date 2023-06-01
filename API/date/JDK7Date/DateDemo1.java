package API.date.JDK7Date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        /*
        public Date()  创建Date对象，表示当前时间
        public Date(long date)  创建Date对象，表示指定时间

        public void setTime(long Time)  设置/修改毫秒值
        public long getTime()  获取时间对象的毫秒值

         */


        //创建对象表示一个时间
        Date d1=new Date();
        System.out.println(d1);

        //创建对象表示一个指定的时间
        Date d2=new Date(0L);   //时间原点  1970 1月1日 0：00 中国在东八区 为8：00
        System.out.println(d2);

        //setTime 修改时间
        d2.setTime(1000L);   //表示过了1000毫秒
        System.out.println(d2);

        //getTime表示当前时间的毫秒值
        long time=d2.getTime();
        System.out.println(time);
    }
}
