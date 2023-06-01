package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        /*
            Method[] getMethods()               返回所有公共成员方法对象，包括继承的
            Method[] getDeclaredMethods()       返回所有成员方法对象，不包括继承的
            Method getMethod(String name,Class<?>...parameterTypes)             返回单个公共成员方法对象
            Method getDeclaredMethod(String name,Class<?>...parameterTypes)     返回单个成员方法对象

            Object invoke(Object obj,Object...args):运行方法
         */

        //1.获取class字节码文件对象
        Class clazz1 = Class.forName("reflect.Student");


        //2.获取所有方法对象(包含父类中的所有公共方法)
        Method[] methods = clazz1.getMethods();
        for(Method m:methods)
            System.out.println(m);

        System.out.println("-----------------");

        //获取所有对象方法，不获取父类中的公共方法
        Method[] methods1=clazz1.getDeclaredMethods();
        for(Method m:methods1)
            System.out.println(m);


        Method eat = clazz1.getDeclaredMethod("eat", String.class);
        System.out.println(eat);        //private void reflect.Student.eat(java.lang.String)

        //获取方法的修饰符
        int modifiers = eat.getModifiers();
        System.out.println(modifiers);      //2  private

        //获取方法的名字
        String name=eat.getName();
        System.out.println(name);           //eat

        //获取方法的形参
        Parameter[] parameters=eat.getParameters();
        for(Parameter p:parameters)
            System.out.println(p);          //java.lang.String arg0


        //获取方法的返回值
        Student s=new Student("zhangsan",18);
        //参数一表示方法的调用者
        //参数二表示方法调用传入的实际参数
        eat.setAccessible(true);
        String result=(String)eat.invoke(s,"汉堡包");        //在吃汉堡包
        System.out.println(result);                                 //奥里给



        //获取方法抛出的异常
        Class[] exceptionTypes = eat.getExceptionTypes();
        for(Class e:exceptionTypes)
            System.out.println(e);          //class java.io.IOException
                                            //class java.lang.NoSuchFieldError
                                            //class java.rmi.NotBoundException

    }
}
