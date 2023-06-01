package Collection.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ImmutableDemo4 {
    public static void main(String[] args) {

        /*
            创建Map的不可变集合，键值对的对象超过10个
         */

        HashMap<String,String> map=new HashMap<>();
        map.put("张三","南京");
        map.put("李四","北京");
        map.put("萧炎","天津");
        map.put("林动","上海");
        map.put("霍雨皓","成都");
        map.put("蓝轩宇","西安");
        map.put("白秀秀","厦门");
        map.put("唐舞麟","广州");
        map.put("小王","深圳");
        map.put("坤坤","杭州");

        //利用上面的数据来获取一个不可变的集合

        //获取到所有键值对对象
        Set<Map.Entry<String,String>> entries=map.entrySet();

        //把entries变成数组
        //toArray方法在底层会比较集合的长度和数组的长度
        //如果集合长度 > 数组的长度，那么就是根据实际数据个数，重新创建数组

        Map<Object,Object> map1=Map.ofEntries(entries.toArray(new Map.Entry[0]));

        //map1.put("a","aaa");  //UnsupportedOperationException


        //JKD10之后
        Map<String,String> map2=Map.copyOf(map);

        //  map1.put("b","bbb");  //UnsupportedOperationException

        System.out.println(map1);
        System.out.println(map2);

    }
}
