package Collection.myMap.hashMap;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        /*
            某个班级80名学生，现在需要组成秋游活动
            班长提供了四个景点依次是（A、B、C、D）
            每个学生只能选一个景点，统计出去哪个经典的人最多

         */

        //1.需要先让同学们投票

        //定义一个数组，存储4个经典
        String[] arr={"A","B","C","D"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list=new ArrayList<>();
        Random r=new Random();
        for(int i=0;i<80;i++){
            int index=r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //2.如果要统计的东西比较多，不方便用计数器思想
        //我们可以定义map集合，利用集合进行统计

        //String表示景点名字，Integer表示景点被投的次数
        HashMap<String,Integer> map=new HashMap<>();

        for(String name:list){
            //判断当前的景点是否在map集合种
            if(map.containsKey(name)){
                //存在
                //先获取当前经典已经被投票的次数
                int count=map.get(name);
                //表示当前经典又被投了一次
                count++;
                //把新的次数再次添加到集合中，覆盖
                map.put(name,count);
            }else{
                //不存在
                map.put(name,1);
            }
        }

        System.out.println(map);

        //3.求最大值
        // A ?
        // B ?
        // C ?
        // D ?
        int max=0;
        String place="";
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for(Map.Entry<String,Integer> e:entries){
            String key=e.getKey();
            int value=e.getValue();
            if(value>max){
                max=value;
                place=key;
            }
        }

        //如果值一样的话，一个循环只能输出一个key的值，而无法输出另一个key值
        System.out.println(max+" "+place);


        //4.判断哪个景点的次数和最大值一样，如果一样，打印
        //再次遍历后可以输出值一样的所有key值
        for(Map.Entry<String,Integer> e:entries){
            int value=e.getValue();
            if(value==max){
                System.out.println(e.getKey());
            }
        }

    }
}
