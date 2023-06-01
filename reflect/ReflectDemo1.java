package reflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
            获取class对象的三种方法：
                1.Class.forName("全类名")
                2.类名.class
                3.对象.getClass()
         */


        //1.Class.forName("全类名")
        //全类名=包名加类名
        //最为常用
        Class clazz1=Class.forName("reflect.Student");
        System.out.println(clazz1);


        //2.类名.class
        //一般当作参数传递
        Class clazz2=Student.class;
        System.out.println(clazz2);
        System.out.println(clazz1.equals(clazz2));

        //3.对象.getClass()
        //我们已经有了这个对象才使用
        Student s=new Student();
        Class clazz3=s.getClass();

        System.out.println(clazz1==clazz3);


    }
}
