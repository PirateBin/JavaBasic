package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {

        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it=coll.iterator();
        while(it.hasNext()){
            String str=it.next();

            if(str.equals("bbb")){
                //不能用集合中的删除方式
                //coll.remove("bbb");        //报错,并发异常  ConcurrentModificationException

                //要用迭代器中的删除方式
                //暂时不能添加
                it.remove();

            }
            System.out.println(str);
        }

        System.out.println(coll);

    }
}
