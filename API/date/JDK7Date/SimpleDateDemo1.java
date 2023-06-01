package API.date.JDK7Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo1 {
    public static void main(String[] args) throws ParseException {

        /*
        public SimpleFormat() 时间的默认格式
        public SimpleFormat(String pattern) 时间的指定格式
        public final String format(Date date)  格式化(日期对象-字符串)
        public Date parse(String source)  解析(字符串-日期对象)
         */


        //定义一个字符串表示时间
        String str="2023-4-2 22:31:10";
        //利用空参构造创建SimpleDateFormat对象
        //创建对象的格式要跟字符串格式完全一致
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse(str);
        //打印结果
        System.out.println(date);
        System.out.println(date.getTime());  //打印时间的毫秒值

        method1();


    }

    private static void method1() {
        //利用空参构造创建SimpleDateFormat对象，默认格式
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date d1=new Date();
        String str=sdf.format(d1);
        System.out.println(str);  //2023/4/2 21:10

        //利用带参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2=sdf2.format(d1);
        System.out.println(str2);

        //yyyy年MM月dd日 时：分：秒 星期
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str3=sdf3.format(d1);
        System.out.println(str3);
    }
}
