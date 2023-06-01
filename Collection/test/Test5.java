package Collection.test;

import java.util.*;
import java.util.function.BiConsumer;

public class Test5 {
    public static void main(String[] args) {
        /*
        需求：
            定义一个Map集合，键用表示省份名称province，值表示city，但是市会有多个
            添加完毕后，遍历结果格式如下：
                江苏省=南京市，扬州市，苏州市，无锡市，常州市
                湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
                广东省=广州市，深圳市，佛山市，汕头市，中山市
         */

        //1.创建一个Map集合
        HashMap<String, ArrayList<String>> map=new HashMap<>();

        //2.创建单列集合存储市的信息
        ArrayList<String> city1=new ArrayList<>();
        Collections.addAll(city1,"南京市","扬州市","苏州市","无锡市","常州市");

        ArrayList<String> city2=new ArrayList<>();
        Collections.addAll(city2,"孝感市","十堰市","武汉市","宜昌市","鄂州市");

        ArrayList<String> city3=new ArrayList<>();
        Collections.addAll(city3,"广州市","深圳市","佛山市","汕头市","中山市");

        //3.向Map集合中添加数据
        map.put("江苏省",city1);
        map.put("湖北省",city2);
        map.put("广东省",city3);

        //遍历Map集合
        //System.out.println(map);



        /*
        //获取entry对象
        Set<Map.Entry<String,ArrayList<String>>> entries=map.entrySet();

        //遍历entry对象
        for(Map.Entry<String,ArrayList<String>> e:entries){
            //创建一个StringBuilder存放
            StringBuilder sb=new StringBuilder();
            //添加进键
            sb.append(e.getKey());
            sb.append("=");
            //添加进值
            ArrayList<String> list1=e.getValue();
            for(int i=0;i<list1.size();i++){
                sb.append(list1.get(i));
                if(i!=list1.size()-1){
                    sb.append(",");
                }
            }
            //打印sb
            System.out.println(sb);
        }

         */


        //利用StringJoiner
        //先获取键值对对象
        Set<Map.Entry<String,ArrayList<String>>> entries=map.entrySet();

        //遍历键值对
        for(Map.Entry<String,ArrayList<String>> e:entries){
            //获取键
            String key=e.getKey();
            //获取值
            ArrayList<String> value=e.getValue();
            //创建StringJoiner对象
            StringJoiner sj=new StringJoiner(",","","");

            for(String c:value) {
                sj.add(c);
            }

            System.out.println(key+" = "+sj);


        }



    }
}
