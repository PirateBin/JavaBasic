package API.packeging.integer;

public class IntegerDemo1 {
    public static void main(String[] args) {

        Integer i1=new Integer(1);
        Integer i2=Integer.valueOf(123);

        System.out.println(i1);
        System.out.println(i2);


        //这两种方式获取对象的区别
        //底层原理：
        //在实际开发中，-127~128之间的数据用的比较多
        //如果每次使用的都是new对象，那么太浪费内存
        //所以提前把这个范围之内的每一个数据创建好对象
        //如果要用到不会创建新的，而是返回已经创建好的对象

        Integer i3=Integer.valueOf(127);
        Integer i4=Integer.valueOf(127);
        System.out.println(i3==i4);    //true

        Integer i5=Integer.valueOf(128);
        Integer i6=Integer.valueOf(128);
        System.out.println(i5==i6);   //false



        //new出来的不是同一个地址值
        Integer i7=new Integer(128);
        Integer i8=new Integer(128);
        System.out.println(i7==i8);  //false



    }

}
