package exception;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        /*
            灵魂四问：如果try中遇到了问题，那么try下面其他的代码还会执行吗？

                下面的代码不会执行了，会直接跳转到对应的catch当中，执行catch里面的语句
                但是如果没有对应的catch捕获，那么还是会交给虚拟机进行处理

         */

        int[] arr={1,2,3,4,5};

        try{
            System.out.println(arr[10]);
            System.out.println("看看我执行了吗？...try");   //不执行
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }

        System.out.println("看看我执行了吗？ 其他代码");

    }
}
