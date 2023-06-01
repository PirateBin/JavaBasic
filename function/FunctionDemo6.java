package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionDemo6 {
    public static void main(String[] args) {

        /*
            方法引用（数组的构造方法）

            数据类型[]::new

            数组的类型要跟流中的数据一致

         */

        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6);

        Integer[] arr=list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int i) {
                return new Integer[i];
            }
        });

        System.out.println(Arrays.toString(arr));


        list.stream().toArray(Integer[]::new);


    }


}
