package exception;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        /*
            自己处理（抛出异常）
            格式：
                try{
                    可能出现异常的代码;
                }catch(异常类名 变量名){
                    异常处理的代码;
                }

         */

        int[] arr={1,2,3,4,5,6};
        //System.out.println(arr[10]);
        //System.out.println("看看我执行了吗");

        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗");

    }
}
