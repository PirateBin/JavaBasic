package Collection.myMap.treeMap;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        /*
            需求：字符串：”aababcabcdabcde"
            请统计字符串中每一个字符出现的次数，并按照以下格式输出
            输出结果：
            a(5)b(4)c(3)d(2)e(1)

            分析：
                统计 --->计数器思想
                弊端：如果我们要统计的东西比较多，非常不方便

                利用Map集合进行统计

                HashMap
                TreeMap
                如果题目中没有要求对结果进行排序，默认使用HashMap
                如果题目中要求对结果进行排序，使用TreeMap

                键：表示要统计的内容
                值：表示次数

         */

        //1.定义字符串
        String s="aababcabcdabcde";

        //2.创建集合
        TreeMap<Character,Integer> map=new TreeMap<>();


        //3.遍历字符串得到每一个字符
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            //拿着c到集合中判断是否存在
            //存在，表示字符又出现了一次
            //不存在，表示当前字符是第一次出现

            if(map.containsKey(c)){
                int count=map.get(c);
                count++;
                map.put(c,count);
            }else{
                map.put(c,1);
            }

        }

        //4.遍历集合
        //a(5)b(4)c(3)d(2)e(1)
        StringBuilder sb=new StringBuilder();

        map.forEach((key,value) ->
                /*sb.append(key);
                sb.append("(");
                sb.append(value);
                sb.append(")");
                 */

                sb.append(key).append("(").append(value).append(")"));

        StringJoiner sj=new StringJoiner("","","");
        map.forEach((key,value)->sj.add(key+"").add("(").add(value+"").add(")"));

        String str=sb.toString();
        System.out.println(str);

        System.out.println(sb);

        System.out.println(sj);



    }
}
