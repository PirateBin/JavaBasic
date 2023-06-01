package Collection.myMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {

        /*
            第二种遍历方式：
                通过键值对遍历方式

         */


        //1.创建map集合
        Map<String,String> map=new HashMap<>();

        //2.添加元素
        map.put("标枪选手","马超");
        map.put("任务挂件","明世隐");
        map.put("御龙骑士","尹志平");

        //3.通过键值对遍历
        //3.1通过一个方法获取所有的键值对对象，返回Set集合
        Set<Map.Entry<String,String>> entries= map.entrySet();  //也可以导包，直接使用Entry
        //3.2遍历entries这个集合，去得到里面的每一个键值对对象
        for(Map.Entry<String,String> e:entries){
            String key=e.getKey();
            String value=e.getValue();
            System.out.println(key+"="+value);
            //御龙骑士=尹志平
            //任务挂件=明世隐
            //标枪选手=马超
            //无序的，因为封装到了Set集合种
        }

        //迭代器
        Iterator<Map.Entry<String,String>> it=entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> next = it.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }

        //lambda表达式
        entries.forEach((next)->System.out.println(next.getKey()+"="+next.getValue()));


    }
}
