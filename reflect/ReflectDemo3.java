package reflect;

import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        /*
            Field[] getFields()             返回所有公共成员变量对象的数组
            Field[] getDeclaredFields()     返回所有成员变量对象的数组
            Field getField(String name)                返回单个公共成员变量的对象
            Field getDeclaredField(String name)        返回单个成员变量对象

            void set(Object obj,Object value)   赋值
            Object get(Object obj)  获取值
         */

        //1.获取class字节码文件的对象
        Class clazz1=Class.forName("reflect.Student");

        //2.获取成员变量
        Field[] fields = clazz1.getFields();
        for(Field f:fields){
            System.out.println(f);
        }

        Field[] fields1=clazz1.getDeclaredFields();
        for(Field f:fields1)
            System.out.println(f);
        /*
            private java.lang.String reflect.Student.name
            private int reflect.Student.age
            public java.lang.String reflect.Student.address
            public long reflect.Student.Tel
        */

        //获取单个成员变量
        Field field1=clazz1.getDeclaredField("name");
        System.out.println(field1);     //private java.lang.String reflect.Student.name

        Field field2=clazz1.getField("address");
        System.out.println(field2);     //public java.lang.String reflect.Student.address


        //获取权限修饰符
        int modifiers = field1.getModifiers();
        System.out.println(modifiers);      //2  2表示私有的private

        //获取成员变量的名字
        String name=field2.getName();
        System.out.println(name);           //address

        //获取成员变量的数据类型
        Class<?> type = field1.getType();
        System.out.println(type);           //class java.lang.String

        //获取成员变量记录的值
        Student s=new Student("zhangsan",23);
        field1.setAccessible(true);
        String value=(String)field1.get(s);
        System.out.println(value);          //zhangsan

        //修改对象里面的值
        field1.set(s,"lisi");
        System.out.println(s);      //Student{name = lisi, age = 23}

    }
}
