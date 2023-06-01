package Collection.generics;

public class GenericsDemo4 {
    public static void main(String[] args) {

        /*
            泛型接口的两种使用方法：
                1.实现类给出具体的类型
                2.实现类延续泛型，创建实现类对象时再确定类型


         */

        MyArrayList2 list=new MyArrayList2();
        list.add("aaa");

        MyArrayList3<String> list2=new MyArrayList3();
        list2.add("aaa");

    }
}
