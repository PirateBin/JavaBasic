package exception;

public class ExceptionDemo8 {
    public static void main(String[] args) {

        //灵魂二问：如果try中可能遇到多个问题，怎么执行？
            //  会写多个catch与之对应
            //  细节：
            //      如果我们要捕获多个异常，这些异常中如果存在父子关系的华，那么父亲一定要写在下面

        int[] arr={1,2,3,4,5};

        try{
            System.out.println(arr[10]);    //ArrayIndexOutOfBoundsException
            System.out.println(2/0);        //ArithmeticException
            String s=null;
            System.out.println(s.equals("abc"));        //NullPointerException
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("Exception");
        }

        System.out.println("看看我执行了吗");

        //索引越界
        //看看我执行了吗

        //JDK7以后我们可以在catch中同时捕获多个异常，中间使用 | 进行隔开
        try{
            System.out.println(arr[10]);    //ArrayIndexOutOfBoundsException
            System.out.println(2/0);        //ArithmeticException
            String s=null;
            System.out.println(s.equals("abc"));        //NullPointerException
        }catch(ArrayIndexOutOfBoundsException  | NullPointerException e){
            System.out.println("索引越界");
        }catch(ArithmeticException e) {
            System.out.println("除数不能为0");
        }

    }
}
