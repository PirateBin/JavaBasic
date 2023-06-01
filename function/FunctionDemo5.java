package function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo5 {
    public static void main(String[] args) {
        /*
            方法引用（类名引用成员方法）
            格式
                类名::成员方法
            需求：
                集合里面一些字符串，要求变成大写后进行输出

                抽象方法形参详解：
                第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法
                在Stream流中，第一个参数一般表示流里的每一个数据，
                假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能引用String类中的方法

                第二个参数到最后一个参数：跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用的方法需要是无参的成员方法

           局限性：
            不能引用所有类中的成员方法
            跟抽象方法的第一个参数有关，这个参数是什么类型的，那么只能引用这个类中的方法

         */

        ArrayList<String> list=new ArrayList<>();

        Collections.addAll(list,"aaa","bbb","ccc");

        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s-> System.out.println(s));

        list.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));

    }
}
