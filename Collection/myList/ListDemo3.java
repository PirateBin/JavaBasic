package Collection.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo3 {
    public static void main(String[] args) {
        /*
            List集合的遍历方式：
                1.迭代器           需要删除元素
                2.列表迭代器        需要添加元素
                3.增强for循环       只想遍历
                4.Lambda表达式      只想遍历
                5.普通for循环       遍历的时候想操作索引

         */


        //创建集合添加元素
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //迭代器
        System.out.println("---Iterator---");
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }

        //增强for
        System.out.println("---for---");
        for(String s:list){
            System.out.println(s);
        }

        //Lambda
        System.out.println("---Lambda---");
        /*
        匿名内部类

        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });

         */

        list.forEach(s->System.out.println(s));


        //普通for
        System.out.println("---普通for---");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //列表迭代器
        ListIterator<String> lit=list.listIterator();
        //比较Iterator多增加了一个add()方法
        while(lit.hasNext()){
            String str=lit.next();
            //当list中找到bbb元素时，往后面添加一个元素qqq
            if("bbb".equals(str)){
                lit.add("qqq");
            }
        }
        System.out.println(list);


    }
}
