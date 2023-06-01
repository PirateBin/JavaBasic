package Collection.myMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {

        /*
            V put(K key,V value)                        添加元素
            V remove(Object key)                        根据键删除值对元素
            void clear()                                移除所有的键值对元素
            boolean containsKey(Object key)             判断集合是否包含指定的键
            boolean containsValue(Object value)         判断集合是否包含指定的值
            boolean isEmpty()                           判断集合是否为空
            int size()                                  集合的长度，也就是集合种键值对的个数
            V get(K key)                                通过传入键返回值

         */

        //1.创建Map集合的对象
        Map<String,String> map=new HashMap<>();

        //2.添加元素
        map.put("郭靖","黄蓉");
        map.put("韦小宝","沐剑屏");
        map.put("尹志平","小龙女");

        //put方法的细节
        //添加/覆盖
        //在添加数据的适合，如果键不存在，那么直接把键值对对象添加到map集合种，方法返回null
        //如果键是存在的，那么把原有的键值对对象覆盖，会把被覆盖的值进行返回
        String value=map.put("韦小宝","双儿");
        System.out.println(value);

        //删除键值对
        //返回键所对应的值
        String result1=map.remove("郭靖");
        System.out.println(result1);

        //清空
        //map.clear();

        //判断是否包含键
        boolean result2=map.containsKey("韦小宝");
        System.out.println(result2);   //true

        //判断是否包含值
        boolean result3=map.containsValue("小龙女");
        System.out.println(result3);  //true

        //判断集合是否为空
        boolean result4=map.isEmpty();
        System.out.println(result4);  //false

        //集合的长度
        System.out.println(map.size());  //2

        //3.打印集合
        System.out.println(map);




    }
}
