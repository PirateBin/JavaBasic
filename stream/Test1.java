package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        /*
            定义一个集合，添加整数
            过滤奇数，只留下偶数
            并将结果保留起来

         */

        ArrayList<Integer> list=new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        Object[] arr=list.stream().filter(s->s%2==0).toArray();
        System.out.println(Arrays.toString(arr));

        List<Integer> list1=list.stream().filter(s->s%2==0).collect(Collectors.toList());
        System.out.println(list1);

    }
}
