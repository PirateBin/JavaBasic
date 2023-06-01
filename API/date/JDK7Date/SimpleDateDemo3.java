package API.date.JDK7Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo3 {
    public static void main(String[] args) throws ParseException {
        /*
        需求：
        秒杀活动：2023年11月11日 0:0:0  (毫秒值)
        结束时间：2023年11月11日 0:10:0

        小贾下单并付款的时间为：2023年11月11日 0:01:00
        小皮下单并付款的时间为：2023年11月11日 0:11:00
        用代码说明这两位同学有没有参加上这次活动

         */

        //比较两个时间
        //下单并付款时间跟 开始时间 和 结束时间对比
        //1.解析时间得到毫秒值
        String startStr="2023年11月11日 0:00:00";
        String endStr="2023年11月11日 0:10:00";
        String orderStr1="2023年11月11日 0:01:00";
        String orderStr2="2023年11月11日 0:11:00";

        //2.解析上面的三个时间，得到Date对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate=sdf.parse(startStr);
        Date endDate=sdf.parse(endStr);
        Date orderDate1=sdf.parse(orderStr1);
        Date orderDate2=sdf.parse(orderStr2);

        //3.得到三个时间的毫秒值
        long startTime=startDate.getTime();
        long endTime=endDate.getTime();
        long orderTime1=orderDate1.getTime();
        long orderTime2=orderDate2.getTime();

        //4.判断
        if(orderTime1>=startTime && orderTime1<=endTime){
            System.out.println("小贾参加秒杀活动成功");
        }else
            System.out.println("小贾参加秒杀活动失败");

        if(orderTime2>=startTime && orderTime2<=endTime){
            System.out.println("小皮参加秒杀活动成功");
        }else
            System.out.println("小皮参加秒杀活动失败");




    }
}
