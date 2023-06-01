package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo10 {
    public static void main(String[] args) {
        /*
            void forEach(Consumer action)   遍历
            long count()                    统计
            toArray()                       收集流中的数据，放到数组中

         */

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","张无忌","赵敏","张强","张三丰","张翠山","张良","唐三","萧炎","林动");

        list.stream().forEach(s->System.out.print(s+" "));

        System.out.println();
        System.out.println("------");
        System.out.println(list.stream().count());

        Object[] arr = list.stream().toArray();
        System.out.println(Arrays.toString(arr));

        /*
        字符串转化为数组
        String s="张无忌,周芷若,张无忌,赵敏,张强,张三丰,张翠山,张良,唐三,萧炎,林动";
            String[] arr1=s.split(",");
            for(String str:arr1){
                System.out.print(str+" ");
            }
         */


        //IntFunction的泛型：具体类型的数组
        //apply的形参，流中的数据个数，要跟数组长度一样

        //toArray方法的参数作用，负责创建一个指定类型的数组
        //toArray方法的底层，会依次得到流里面每一个数据，并把数据放到数组中
        //toArray方法的返回值，是一个装着流里面所有数据的数组
        //value表示流中数据个数

        /*
        list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

         */

        String[] arr2=list.stream().toArray(value->new String[value]);
        System.out.println(Arrays.toString(arr2));  //[张无忌, 周芷若, 张无忌, 赵敏, 张强, 张三丰, 张翠山, 张良, 唐三, 萧炎, 林动]



    }
}
