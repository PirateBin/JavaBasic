package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo9 {
    public static void main(String[] args) {
        /*
            map         转换流中的数据类型

         */

        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张无忌-16","周芷若-14","张无忌-19","赵敏-22","张强-31","张三丰-42",
                "张翠山-19","张良-24","唐三-23","萧炎-18","林动-19");

        //需求：只获取里面的年龄并进行打印
        //String -> int

        /*
        list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //在-处分割字符串，前面的装入数组0索引，后面的装入数组1索引
                String[] arr=s.split("-");
                String ageString=arr[1];
                int age=Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s->System.out.println(s));

         */

        list1.stream().map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s->System.out.print(s+" "));

    }
}
