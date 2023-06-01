package Collection.mySet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {

        //1.创建TreeSet集合对象
        TreeSet<Integer> ts=new TreeSet<>();

        //2.添加元素
        ts.add(1);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(5);

        //3.打印集合
        System.out.println(ts);  //[1, 2, 3, 4, 5] 自动排序

        //4.遍历集合
        //迭代器
        Iterator<Integer> it=ts.iterator();
        while(it.hasNext()){
            int i=it.next();
            System.out.println(i);
        }

        //增强for
        for(int i:ts){
            System.out.println(i);
        }

        //lambda表达式
        ts.forEach(i->System.out.println(i));


        System.out.println('A'+0);

    }
}
