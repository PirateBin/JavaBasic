package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo11 {
    public static void main(String[] args) {

        /*
            collect(Collector collector)    收集流中的数据，放到集合中(List Set Map)

         */

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌-男-16","周芷若-女-14","张桑-男-19","赵敏-女-22","张强-男-31","张三丰-男-42",
                "张翠山-女-19","张良-男-24","唐三-女-23","萧炎-男-18","林动-男-19");

        //收集List集合中的男性
        List<String> newlist=list.stream().filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newlist);

        //收集到Set集合中
        Set<String> newset=list.stream().filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newset);

        //收集到Map集合中
        //键：姓名
        //值：年龄
        /*
            toMap() 参数1表示键的生成规则
                    参数2表示值的生成规则

            方法apply形参：依次表示流里面每一个数据
                        方法体：生成键的代码
                        返回值：已经生成的键

         */

        /*


        Map<String,Integer> map=list.stream().filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  return s.split("-")[0];
                                              }
                                          },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));

         */

        Map<String,Integer> map=list.stream().filter(s->"男".equals(s.split("-")[2]))
                        .collect(Collectors.toMap(s->s.split("-")[0],
                                                  s->Integer.parseInt(s.split("-")[2])));


        System.out.println(map);

    }
}
