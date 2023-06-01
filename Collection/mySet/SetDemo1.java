package Collection.mySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    public static void main(String[] args) {
        /*
            利用Set系列的集合，添加字符串，并使用多种方式遍历
            迭代器
            增强for
            Lambda表达式

         */


        //1.创建一个Set集合的对象
        Set<String> s=new HashSet<>();

        //2.添加元素
        boolean result1=s.add("zhangsan");
        boolean result2=s.add("zhangsan");
        System.out.println(result1);
        System.out.println(result2);   //false 说明Set中不能存储相同的元素

        s.add("lisi");
        s.add("wangwu");

        //打印集合
        System.out.println(s);  //[lisi, zhangsan, wangwu]  说明set中存储是无序的

        //迭代器遍历
        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }

        //增强for遍历
        for(String str:s){
            System.out.println(str);
        }

        //lambda表达式
        /*s.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

         */

        s.forEach(str->System.out.println(str));


    }
}
