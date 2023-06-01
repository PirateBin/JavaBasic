package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {

        /*
            单列集合  default Stream<E> stream()                             Collection中的默认方法
            双列集合  无                                                     无法直接使用stream流
            数组      public static <T> Stream<T> stream(T[] array)         Arrays工具类中的静态方法
            一堆零散数据  public static <T> Stream<T> of(T..values)          Stream接口中的静态方法

         */

        //1.单列集合获取Stream流
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        //获取到一条流水线，并把集合中的数据放到流水线上
        //Stream<String> stream1=list.stream();
        //使用终结方法打印流水线上所有数据
        //stream1.forEach(s->System.out.print(s+" "));

        list.stream().forEach(s->System.out.println(s+" "));


    }


}
