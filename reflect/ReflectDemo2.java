package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /*
            Constructor<?>[] getConstructors()                                  获取所有构造方法(public)
            Constructor<?>[] getDeclaredConstructors()                          获取所有构造方法
            Constructor<?> getConstructors(Class<?>...parameterTypes)           获取单个构造方法(public)
            Constructor<?> getDeclaredConstructors(Class<?>...parameterTypes)   获取单个构造方法
         */

        //1.获取class字节码文件对象
        Class clazz = Class.forName("reflect.Student");

        //2.获取所有构造方法
        Constructor[] cons=clazz.getConstructors();
        for(Constructor con:cons){
            System.out.println(con);
        }

        Constructor[] cons1=clazz.getDeclaredConstructors();
        for(Constructor con:cons1){
            System.out.println(con);
        }

        //3.获取单个构造方法
        Constructor con1=clazz.getConstructor();
        System.out.println(con1);       //public reflect.Student()

        Constructor con2=clazz.getDeclaredConstructor(String.class);
        System.out.println(con2);       //protected reflect.Student(java.lang.String)

        Constructor con3=clazz.getDeclaredConstructor(String.class,int.class);
        System.out.println(con3);           //public reflect.Student(java.lang.String,int)

        int modifiers = con3.getModifiers();
        System.out.println(modifiers);      //1   1表示的是public
        //2表示的是private
        //4表示的protected
        //8表示的是static

        Parameter[] parameters = con3.getParameters();
        for(Parameter p:parameters)
            System.out.println(p);


        //setAccessible 表示临时取消权限校验
        //暴力反射，强行获取private或者protected修饰的构造方法
        con3.setAccessible(true);
        Student s =(Student) con3.newInstance("张三", 23);
        System.out.println(s);      //Student{name = 张三, age = 23}

    }
}
