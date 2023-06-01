package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        /*
            Collection系列集合有三种通用的遍历方式：
                1.迭代器遍历
                2.增强for循环
                3.lambda表达式遍历

                迭代器遍历的三个方法：
                    Iterator<E> iterator()  :获取一个迭代器对象
                    boolean hasNext()       :判断挡墙指向的位置是否有元素
                    E.next()                :获取当前指向的元素并移动指针

         */

        //1.创建集合并添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        //默认指向0索引
        Iterator<String> it=coll.iterator();

        //循环获取集合中的每一个元素
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }


        //当上面的循环结束之后，迭代器的指针已经指向了最后没有元素的位置
        //System.out.println(it.next());  //NoSuchElementException

        //迭代器遍历完毕，指针不会复位
        //System.out.println(it.hasNext());  //false

        //如果要继续第二次遍历集合，我们要重新获取一个迭代器的对象
        Iterator<String> it2=coll.iterator();
        while(it2.hasNext()){
            String str=it2.next();
            System.out.println(str);
        }

        //循环中只能使用一个next方法
        //迭代器遍历的时候，不能用集合的方式进行增加或者删除
        /*
        Iterator<String> it2=coll.iterator();
        while(it2.hasNext()){
            String str=it2.next();

            if(str.equals("bbb")){
            coll.remove("bbb");        //报错,并发异常
            }
        }
         */

    }
}
