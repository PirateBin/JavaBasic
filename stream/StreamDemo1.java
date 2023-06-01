package stream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        /*
            创建集合添加元素
            1.把所有以"张"开头的元素存到新集合中
            2.把"张"开头，长度为3的元素再存储到新集合中
            3.遍历打印最终结果

         */
        ArrayList<String> list1=new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷诺");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        //1.把所有以张开头存储到新集合
        ArrayList<String> list2=new ArrayList<>();

        for(String name: list1){
            if(name.startsWith("张")){
                list2.add(name);
            }
        }

        //2.把"张"开头，长度为3的元素再存储到新集合中
        ArrayList<String> list3=new ArrayList<>();
        for(String name: list1){
            if(name.startsWith("张") && name.length()==3){
                list3.add(name);
            }
        }

        //3.遍历打印
        list3.forEach(s->System.out.println(s));

    }
}
