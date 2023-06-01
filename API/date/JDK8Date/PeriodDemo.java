package API.date.JDK8Date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {

        //当前本地年月日
        LocalDate today=LocalDate.now();
        System.out.println(today);

        //生日的年月日
        LocalDate birthday=LocalDate.of(2002,1,14);
        System.out.println(birthday);

        Period period=Period.between(birthday,today);  //第二个参数减去第一个参数
        System.out.println(period);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());

    }
}
