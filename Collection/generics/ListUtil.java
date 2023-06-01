package Collection.generics;

import java.util.ArrayList;

public class ListUtil {

    //定义一个私有构造方法，使该类无法被创建对象
    private ListUtil(){}

    /*
        参数一：集合
        参数二~最后：最后要添加的元素

     */



    public static <E> void addAll(ArrayList<E> list,E e1,E e2, E e3){
        list.add(e1);
        list.add(e2);
        list.add(e3);

    }




    public static <E> void addAll2(ArrayList<E> list,E...e){
        //E...e是E类型的一个可变数组
        for(E element : e){
            list.add(element);
        }
    }



}
