package Collection.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsDemo3 {

    /*
        定义一个工具类：ListUtil
        类中定义一个静态方法addAll：用来添加多个集合的元素
     */

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        ListUtil.addAll(list,"aaa","bbb","ccc");
        System.out.println(list);

        ArrayList<Integer> list2=new ArrayList<>();
        ListUtil.addAll2(list2,111,222,333,1,2,6443,90);
        System.out.println(list2);

    }

}
