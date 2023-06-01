package stream;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        /*
            distinct        元素去重，依赖(hashCode和equals方法)
            concat          合并a和b两个流为一个流

         */

        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张无忌","周芷若","张无忌","赵敏","张强","张三丰","张翠山","张良","唐三","萧炎","林动");

        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"唐舞麟","蓝轩宇");

        list1.stream().distinct().forEach(s->System.out.print(s+" "));

        System.out.println();

        //concat是Stream中的静态方法
        Stream.concat(list1.stream(),list2.stream()).forEach(s->System.out.print(s+" "));

    }
}
