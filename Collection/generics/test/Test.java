package Collection.generics.test;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        Cat a1=new PersianCat("a",1);
        Cat a2=new LiHuaCat("b",2);

        ArrayList<PersianCat> list1=new ArrayList<>();
        ArrayList<LiHuaCat> list2=new ArrayList<>();


        list1.add(new PersianCat());
        list1.add((PersianCat) a1);
        list2.add((LiHuaCat) a2);

        keepPet1(list1);
        keepPet1(list2);


    }


    //要求1：该方法能养所有品种的猫，但不能养狗
    public static void keepPet1(ArrayList<? extends Cat> list){
        //遍历集合，调用动物的eat方法
        for(Cat c:list){
            c.eat();
        }

    }

    //要求2：该方法能养所有品种的狗，但不能养猫
    public static void keepPet2(ArrayList<? extends Dog> list){
        //遍历集合，调用动物的eat方法

        for(Dog d:list){
            d.eat();
        }

    }

    //要求3：该方法能养所有品质的动物，但不能传递其他类型
    public static void keepPet3(ArrayList<? extends Animal> list){
        //遍历集合，调用动物的eat方法
        for(Animal a:list){
            a.eat();
        }


    }
}
