package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合的对象
        //泛型：限定集合中存储类型
        //ArrayList<String> list=new ArrayList<String>();

        //打印对象不是地址值，而是集合中存储的数据内容
        //在展示的时候会把数据用[]包含
        //ArrayList增删改查
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

    }
}
