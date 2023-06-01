package function;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {

        /*
            方法引用（引用静态方法）

            类::方法名

         */

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.print(s+" "));


        //1.方法需要已经存在
        //2.方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //3.方法的功能是需要把形参的字符串转换成整数

        list.stream().map(Integer::parseInt).forEach(s-> System.out.print(s+" "));



    }
}
