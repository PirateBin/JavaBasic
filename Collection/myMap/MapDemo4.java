package Collection.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        /*
        第三种遍历方式
         */

        //1.创建Map集合的对象
        Map<String,String> map=new HashMap<>();

        //2.添加元素
        map.put("鲁迅","这句话是我说的");
        map.put("曹操","不可能绝对不可能");
        map.put("刘备","接着奏乐接着舞");
        map.put("柯镇恶","看我眼色行使");

        //3.利用lambda表达式进行遍历
        //匿名内部类
        //底层：
        //forEach其实就是利用第二种方法进行遍历，依次得到每一个键值对对象
        //再次调用accept方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });

        //lambda
        map.forEach((key,value)-> System.out.println(key+"="+value));

    }
}
