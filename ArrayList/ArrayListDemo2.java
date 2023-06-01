package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
      /*
        boolean add(E e) 添加

        boolean remove(E e) 删除
        E remove(int index)

        E set(int index,E e) 修改

        E get(int index) 查询

        int size() 获取长度
       */

       ArrayList<String> list=new ArrayList<>();

       //添加元素
       list.add("aaa");
       list.add("bbb");
       list.add("ccc");
       System.out.println(list);

       //删除元素
        /*boolean result=list.remove("aaa");
        System.out.println(result);

        String str=list.remove(0);
        System.out.println(str);

        list.remove("ccc");
        System.out.println(list);
         */

        //修改元素
        String result2=list.set(1,"ddd");
        System.out.println(result2);
        System.out.println(list);

        //查询元素
        String s=list.get(0);
        System.out.println(s);

        //遍历
        for(int i=0;i<list.size();i++){
            String str=list.get(i);
            System.out.println(str);
        }
    }
}
