package Collection.myMap;

import java.util.*;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {

        /*
            Map的遍历方式:
                1.通过键找值

         */

        //1.创建Map集合的对象
        Map<String,String> map=new HashMap<>();

        //2.添加元素
        map.put("郭靖","穆念慈");
        map.put("欧阳克","黄蓉");
        map.put("尹志平","小龙女");

        //3.通过键找值

        //3.1获取所有的键，把这些键放到一个单列集合种
        Set<String> keys=map.keySet();
        //3.2遍历单列集合，得到每一个键
        for(String key:keys){
            //System.out.println(key);
            //3.3利用map集合种的键获取对应的值 get
            String value=map.get(key);
            System.out.println(key+"="+value);
        }


        //迭代器遍历
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            String str=it.next();
            //System.out.println(str);
            String value=map.get(str);
            System.out.println(str+"="+value);
        }

        //lambda表达式遍历
        keys.forEach(s-> System.out.println(s+"="+map.get(s)));


    }
}
