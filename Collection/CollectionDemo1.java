package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
            public boolean add(E,e)                 添加
            public void clear()                     清空
            public boolean remove(E,e)              删除
            public boolean contains(Object obj)     判断是否包含
            public boolean isEmpty()                判断是否为空
            public int size()                       集合长度


            注意：
            Collection是一个接口,我们不能之间创建他的对象
            所以，我们只能创建他实现类的对象
            实现类：ArrayList

         */
        //多态创建ArrayList集合
        Collection<String> coll=new ArrayList<>();

        //添加对象
        //细节1：如果我们往List系列集合中添加元素，方法永远返回true
        //细节2：如果我们往Set系列集合中添加数据，如果当前添加元素不存在返回true，
                                           //如果当前添加元素存在返回false，因为Set系列的集合不允许重复
        //boolean result1=coll.add("aaa");
        coll.add("aaa");
        coll.add("bbb");

        System.out.println(coll);

        //清空集合
        //coll.clear();
        System.out.println(coll);

        //删除remove
        //注意：因为Collection里面定义的是共性的方法，所以此时不能通过从索引删除，只能通过元素的对象删除
        //删除元素不存在返回false
        //boolean result1=coll.remove("aaa");
        System.out.println(coll.remove("aaa"));
        System.out.println(coll);

        //判断元素是否存在
        //底层原理：contain方法是依赖equals方法进行判断的
        //如果存储的是自定义对象，也想通过contain方法来判断是否包含，那么再javabean类中，一定要重写equals方法
        boolean result=coll.contains("aaa");
        System.out.println(result);

        //判断集合是否为空
        boolean result2=coll.isEmpty();
        System.out.println(result2);


        //获取集合的长度
        System.out.println(coll.size());


        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for(int i=0;i<list.size();i++){
            String x=list.get(i);
            System.out.println(coll);
        }


    }
}
