package Collection.mySet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        /*
            哈希值：
                对象的整数表现形式
                1.如果没有重写hashCode方法，计算出的哈希值是不同的
                2.如果重写了hashCode方法，不同的对象只要属性值相同，计算出来的哈希值就是一样的
                3.小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能是一样的。（哈希碰撞）

         */

        //1.创建对象
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("zhangsan",18);

        //2.没有重写hashCode方法
        int c1=s1.hashCode();
        System.out.println(c1); //363771819
        System.out.println(s2.hashCode());  //2065951873
        //重写之后变为相同的哈希值  -1461067297

        System.out.println("abc".hashCode()); //96354
        System.out.println("acD".hashCode()); //96354  哈希碰撞


    }
}
