package io.properties;

import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {

        //1.创建集合的对象
        Properties prop=new Properties();

        //2.添加数据
        //细节：虽然我们可以往Properties当中可以添加任意的数据类型，但是一般只添加字符串类型的数据
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","444");

        //3.遍历集合
        Set<Object> keys = prop.keySet();
        for(Object key:keys){
            Object value=prop.get(key);
            System.out.println(value);
        }

        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for(Map.Entry<Object,Object> e:entries){
            Object key=e.getKey();
            Object value=e.getValue();
            System.out.println(key+" "+value);
        }
    }
}
