package Collection.myList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        /*
            List集合独有的方法：
                void add(int index,E element)       在此集合中的指定位置插入指定的元素
                E remove(int index)                 删除指定索引处的元素，返回被删除的元素
                E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
                E get(int index)                    返回指定索引处的元素

         */

        //1.创建一个集合
        //List也是一个接口，接口的多态
        List<String> list=new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //add
        list.add(1,"QQQ");

        //remove
        String remove=list.remove(0);
        System.out.println(remove);

        //set
        String modify=list.set(0,"www");
        System.out.println(modify);  //QQQ 被修改为www，返回QQQ

        //get
        String s=list.get(0);
        System.out.println(s);  //www


        //打印集合
        System.out.println(list);  //[www, bbb, ccc]

    }
}
