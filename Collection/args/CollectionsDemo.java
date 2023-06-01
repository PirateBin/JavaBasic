package Collection.args;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        /*
            public static <T> boolean addAll(Collection<T> c,T... elements) 批量添加元素
            public static void shuffle(List<?> list)                        打乱List集合的元素顺序
         */

        //1.创建集合
        ArrayList<String> list=new ArrayList<>();

        //2.批量添加元素
        Collections.addAll(list,"abc","bcd","qwer","df","zxcv","1234");

        //3.打印集合
        System.out.println(list);

        //4.打乱顺序
        Collections.shuffle(list);
        System.out.println(list);

    }
}
