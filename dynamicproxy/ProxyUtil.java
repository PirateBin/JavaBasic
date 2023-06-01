package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
    类的作用：创建一个代理
 */
public class ProxyUtil {

    private ProxyUtil() {}


    /*
    方法的作用：
      给一个明星的对象，创建一个代理
      形参：被代理的对象
      返回值：给明星创建的代理

     */
    public static Star createProxy(BigStar bigStar){

        //public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
        //参数一：用于指定哪个类去加载器，去加载生成的代理类
        //参数二：指定接口，这些接口用于指定生成的代理有哪些方法
        //参数三：用来指定生成的代理对象要干什么事情

        Star star=(Star)Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),       //谁来代理
                new Class[]{Star.class},                //代理哪些接口中
                new InvocationHandler() {               //方法实现了什么
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        //参数一：代理的对象
                        //参数二：要运行的方法 sing
                        //参数三：传递的实参
                        if("sing".equals(method.getName())){
                            System.out.println("准备话筒，收钱");
                        }else if("dance".equals(method.getName())){
                            System.out.println("准备场地，收钱");
                        }
                        //去找明星开始唱歌或者跳舞
                        //method相当与sing方法
                        return method.invoke(bigStar,objects);

                    }
                });
        return star;
    }
}
