package API.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {

        Integer[] arr={2,3,1,5,6,7,8,4,9};

        /*
        Arrays.sort(arr,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2) {
                return o1-o2;
            }

            细节：
            Lambda表达式可以用来简化匿名内部类的书写
            Lambda表达式只能简化函数式接口的匿名内部类的写法
            函数式接口：
                有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以家@FunctionalInterface注解

        });

         */

        //Lambda表达式
        Arrays.sort(arr,(Integer o1,Integer o2)->{
            return o1-o2;
            });


        System.out.println(Arrays.toString(arr));

    }
}
