package exception;

public class throwDemo1 {
    public static void main(String[] args) {

        /*
            throws:写在方法定义处，表示声明一个异常，高数调用者，使用本方法可能会有哪些异常
            throw: 写在方法内，结束方法，手动抛出异常，交给调用者，方法下面的代码不再执行了

         */

        int[] arr={1,2,3,4,5};
        int max=0;

        int[] arr1=null;


        try {
            max = getMax(arr1);      //NullPointerException
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }

        System.out.println(max);




    }

    public static int getMax(int[] arr) /* throws NullPointerException,ArrayIndexOutOfBoundsException */{
        if(arr==null){
            //手动创建一个异常对象，并把这个异常交给方法的调用者处理
            //此时方法就会结束，下面的代码不会再执行了
            throw new NullPointerException();
        }

        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("看看我执行了吗");

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
