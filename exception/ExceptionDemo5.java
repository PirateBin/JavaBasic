package exception;

public class ExceptionDemo5 {
    public static void main(String[] args) {

        //JVM把异常输出到控制台，并且异常以下代码不执行

        System.out.println("12345");    //12345
        System.out.println(2/0); //ArithmeticException

        //下面的代码不再运行
        System.out.println("abcde");
        System.out.println("abc123");

    }
}
