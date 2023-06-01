package exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        Student2 s1=new Student2();

        //Student2中年龄限制18~20
        s1.setAge(22);  //RuntimeException

    }
}
