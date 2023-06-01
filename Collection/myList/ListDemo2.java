package Collection.myList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {

        //List集合两个删除的方法
        //1.直接删除元素
        //2.通过索引进行删除

        //1.创建集合并添加元素
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //2.删除元素
        //请问：此时删除的是1这个元素，还是1索引上的元素
        //为什么？
        //因为在调用方法的时候，如果出现了重载
        //优先调用，实参和形参类型一致的那个方法
        list.remove(1);

        //如果我们想删除1这个元素
        //可以手动装箱
        Integer i=Integer.valueOf(1);

        //拆箱
        //int a=i.intValue();
        //System.out.println(a);

        list.remove(i);

        //3.打印
        System.out.println(list);

    }
}
