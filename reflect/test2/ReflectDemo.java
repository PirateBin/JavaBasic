package reflect.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /*
            反射可以跟配置文件结合的方法，动态创建对象，调用方法
         */

        //1.读取配置文件中的信息
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("reflectproperties.txt");
        prop.load(fis);
        fis.close();
        System.out.println(prop);       //{classname=reflect.test2.Student, method=study}

        //2.获取全类名和方法名
        String className=(String)prop.get("classname");
        String methodName=(String)prop.get("method");

        //3.利用反射创建对象并运行方法
        Class clazz=Class.forName(className);

        //获取构造方法
        Constructor con = clazz.getDeclaredConstructor(String.class,int.class);
        Object o=con.newInstance("zhangsan",18);
        System.out.println(o);          //Student{name = null, age = 0}

        //获取成员方法运行
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);           //学生正在学习!


    }
}
