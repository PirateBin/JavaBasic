package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    /*
        编译异常
     */
    public static void main(String[] args) throws ParseException {

        String time="2030年1月1日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date date=sdf.parse(time);  //java: 未报告的异常错误java.text.ParseException; 必须对其进行捕获或声明以便抛出
        System.out.println(date);

        //运行时异常
        int[] arr={1,2,3};
        //System.out.println(arr[3]);  //ArrayIndexOutOfBoundsException




    }

}
