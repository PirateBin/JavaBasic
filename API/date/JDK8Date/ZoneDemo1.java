package API.date.JDK8Date;

import java.time.ZoneId;
import java.util.Set;

public class ZoneDemo1 {
    public static void main(String[] args) {

        //获取所有时区的名称
        Set<String> zoneIds= ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);  //Asia/Shanghai

        //获取系统的默认时区
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);  //Asia/Shanghai

        //获取一个指定时区
        ZoneId zoneId1=ZoneId.of("Etc/GMT+9");
        System.out.println(zoneId1);


    }
}
