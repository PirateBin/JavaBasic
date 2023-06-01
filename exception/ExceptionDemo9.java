package exception;

public class ExceptionDemo9 {
    public static void main(String[] args) {

        /*
            灵魂三问：如果try中遇到的问题没有被捕获，怎么执行？

                此时相当于try...catch代码白写，最后还是会交给虚拟机进行处理
         */

        int[] arr={1,2,3,4,5,6};

        try{
            System.out.println(arr[10]);        //ArrayIndexOutOfBoundsException
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗");

    }
}
