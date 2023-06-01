package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo4 {
    public static void main(String[] args) {
        //双列集合


        //1.创建双列集合
        HashMap<String,Integer> map=new HashMap<>();

        //2.添加数据
        map.put("aaa",111);
        map.put("bbb",222);
        map.put("ccc",333);
        map.put("ddd",444);

        //3.获取Stream流
        map.keySet().stream().forEach(s->System.out.println(s));

        //获取键值对的Stream流
        map.entrySet().stream().forEach(s->System.out.println(s));


    }
}
