package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionDemo7 {
    public static void main(String[] args) {

        /*
            需求：
                集合存储一些字符串的数据
                收集到Student类型的数组中

         */

        ArrayList<String> list=new ArrayList<>();

        Collections.addAll(list,"张无忌,16","周芷若,14","张无忌,19","赵敏,22","张强,31","张三丰,42",
                "张翠山,19","张良,24","唐三,23","萧炎,18","林动,19");


        /*

        list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            }
        }).forEach(s-> System.out.println(s));


         */


        Student[] arr=list.stream().map(Student::new).toArray(Student[]::new);

        System.out.println(Arrays.toString(arr));

    }
}
