package Collection.generics;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {
        /*
            需求：
                定义一个方法，形参是一个集合，但是集合中的数据类型不确定

         */

        //创建集合对象
        ArrayList<Ye> list1=new ArrayList<>();
        ArrayList<Fu> list2=new ArrayList<>();
        ArrayList<Zi> list3=new ArrayList<>();

        //Student2也被传递过来了
        ArrayList<Student2> list4=new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);

        // method(list4);




    }

    /*
        利用泛型方法具有一个弊端：
        泛型方法可以接受任意类型的数据类型

        希望：本方法虽然不确定类型，但是以后我只希望传递Ye Fu Zi

        此时我们就可以使用泛型的通配符
            ?也表示不确定的类型
            他可以进行类型的限定
            ? extends E:表示可以传递E或者E所有的子类类型
            ? super E:表示可以传递E或者E的所有父类类型

        应用场景：
            1.如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口
            2.如果类型不确定，但是能知道以后只能传递某个继承体系中的，就可以泛型的通配符

     */
    public static  void method(ArrayList<? extends Ye> list){

    }
}

class Student2{}
