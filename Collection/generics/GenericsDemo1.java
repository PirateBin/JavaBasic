package Collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class GenericsDemo1 {
    public static void main(String[] args) {

        //在没有泛型的时候如何存储数据
        //结论：
        //如果我们没有给集合指定类型，默认认为所有的数据是Object类型
        //此时可以往集合中添加任意的数据类型
        //带来一个坏处：无法使用他的特有行为

        //此时推出泛型，在添加数据的时候把类型统一
        //而且我们在获取数据的时候，也省了强转

        //1.创建集合的对象
        ArrayList list=new ArrayList();

        //2.添加元素
        list.add(123);
        list.add("aaa");
        list.add(new Student("zhangsan",18));

        //3.遍历集合获取每一个元素
        Iterator it=list.iterator();
        while(it.hasNext()){
            Object obj=it.next();

            //多态的弊端是不能访问子态的特有功能
            //obj.length(); 无法使用
            System.out.println(obj);
        }


    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String toString(){
        return "name="+name+",age="+age;
    }
}
