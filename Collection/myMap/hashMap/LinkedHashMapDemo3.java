package Collection.myMap.hashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo3 {
    public static void main(String[] args) {
        /*
            LinkedHashMap:
                由键决定：
                    有序、不重复、无索引
                有序：
                    保证存储和取出的顺序一样
                原理：
                    底层数据结构是哈希表，只是每个键值对元素又额外多了一个双链表机制记录存储的顺序

         */

        //1.创建集合
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();

        //2.添加元素
        map.put("a",123);
        map.put("b",456);
        map.put("c",142);

        map.put("a",789);

        //3.打印集合
        System.out.println(map);    //{a=123, b=456, c=142, d=789}

    }
}
