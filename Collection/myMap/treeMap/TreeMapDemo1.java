package Collection.myMap.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*
            TreeMap集合：基本应用
                需求1：
                    键：整数表示id
                    值：字符串表示商品名称
                    要求：按照id的升序排列、按照id的降序排列

         */

        //1.创建集合对象
        //TreeMap<Integer,String> map=new TreeMap<>();

        TreeMap<Integer,String> map=new TreeMap<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                //o1:当前要添加的元素
                //o2:已经在红黑树存在的元素
                return o2-o1;
            }
        });

        //2.添加元素
        map.put(5,"奥利奥");
        map.put(2,"康师傅");
        map.put(1,"红牛");
        map.put(4,"蒙牛");
        map.put(3,"可口可乐");

        //3.打印集合
        System.out.println(map);



    }
}
