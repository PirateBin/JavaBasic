package Collection.immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        /*
            创建Map的不可变集合

            键不能重复

            Map.of里的参数最多传10个键值对

            如果我们要传递多个键值对对象，数量大于10个，直接传入键值对对象 ofEntries
         */

        Map<String,String> map=Map.of("张三","南京","李四","广东","王五","北京");

        Set<Map.Entry<String,String>> entries=map.entrySet();
        for(Map.Entry<String,String> e:entries){
            String key=e.getKey();
            String value=e.getValue();
            System.out.println(key+" "+value);
        }

    }
}
