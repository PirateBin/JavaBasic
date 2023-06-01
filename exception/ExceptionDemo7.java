package exception;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        /*
            灵魂一问：如果try中没有遇到问题，怎么执行？
            灵魂二问：如果try中可能遇到多个问题，怎么执行？
            灵魂三问：如果try中遇到的问题没有被捕获，怎么执行？
            灵魂四问：如果try中遇到了问题，那么try下面其他的代码还会执行吗？
         */

        //灵魂一问：如果try中没有遇到问题，怎么执行？
        //          会把try里面所有的代码全部执行完毕，不会执行catch里面的代码
        //          只有当出现了异常才会执行catch里面的代码


        int[] arr={1,2,3,4,5};

        try{
            System.out.println(arr[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }

        System.out.println("看看我执行了吗");

    }
}
