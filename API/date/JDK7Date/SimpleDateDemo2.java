package API.date.JDK7Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo2 {
    public static void main(String[] args) throws ParseException {
        /*

        日期：2000-11-11
        用字符串来表示这个数据，并将其转换为：2000年11月11日

         */

        //可以通过2000-11-11进行解析，解析成一个Date对象
        String str="2000-11-11";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=sdf1.parse(str);

        //再通过日期对象转换为字符串对象
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
        String str2=sdf2.format(d1);
        System.out.println(str2);

    }
}
