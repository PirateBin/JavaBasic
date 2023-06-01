package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo7 {
    public static void main(String[] args) {

        /*
            filter      过滤
            limit       获取前几个元素
            skip        跳过前几个元素

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来数组或者集合中的数据
         */

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","唐三");

        //filter 过滤 把张开头的留下，其余过滤
        /*
        list.stream().filter(new Predicate<String>(){
            @Override
            public boolean test(String s) {
                //如果返回的为true，表示当前数据留下
                //如果返回值为false，表示当前数据舍弃不要
                return s.startsWith("张");
            }
        }).forEach(s->System.out.println(s));

         */
        list.stream().filter(s->s.startsWith("张")).forEach(s->System.out.println(s));

        System.out.println(list);


        System.out.println("------");
        list.stream().limit(3).forEach(s->System.out.println(s));

        System.out.println("------");
        list.stream().skip(4).forEach(s->System.out.println(s));

        System.out.println("------");
        list.stream().skip(3).limit(3).forEach(s->System.out.println(s));


    }
}
