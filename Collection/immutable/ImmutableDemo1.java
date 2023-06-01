package Collection.immutable;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*
            创建不可变集合
         */

        List<String> list=List.of("zhangsan","lisi","wangwu","zhaoliu");

        System.out.println(list.get(0));

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
            }

        //list.remove("zhangsan");   不可修改的集合
        //System.out.println(list); //UnsupportedOperationException


        }

    }

