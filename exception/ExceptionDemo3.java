package exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {

        //异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况

        Student2 stu=new Student2("张三,23");

        System.out.println(stu);

    }
}
