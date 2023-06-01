package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionForDemo6 {
    public static void main(String[] args) {
        /*
            增强for格式：
                for(数据类型 变量名： 集合/数组){

                }

         */

        //1.创建集合并添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        //2.用增强for循环遍历集合
        //s就说一个第三方变量，再循环的过程中一次表示集合中的每一个数据
        for(String s : coll){
            System.out.println(s);
        }


    }
}
