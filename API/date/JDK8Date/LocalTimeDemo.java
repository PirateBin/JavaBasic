package API.date.JDK8Date;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {

        //获取本地的日历对象（时分秒）
        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        int hour=lt.getHour();
        int minute=lt.getMinute();
        int second=lt.getSecond();
        int nano=lt.getNano();
        System.out.println("现在的时间是"+hour+": "+minute+": "+second);

        System.out.println(LocalTime.of(8,10,20)); //08:10:20

        //is系列、with、minus、plus和LocalDate一致



    }
}
