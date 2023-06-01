package API.packeging.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {

        //用代码计算你活了多少天，用JDK7和JDK8方式来完成

        //JDK7
        //规则：只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值

        //计算出出生年月日的毫秒值
        String birthday="2002年1月1日";
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日");
        Date date=sdf.parse(birthday);
        long birthdayTime=date.getTime();


        //当前时间
        long todayTime=System.currentTimeMillis();

        //计算间隔多少天
        long time=todayTime-birthdayTime;
        System.out.println(time/1000/60/60/24);  //7763

        //JDK8
        // Period  Duration  ChronoUnit
        LocalDate today1= LocalDate.now();
        LocalDate birthday1=LocalDate.of(2002,1,1);

        long days= ChronoUnit.DAYS.between(birthday1,today1);
        System.out.println(days);  //7763


    }
}
