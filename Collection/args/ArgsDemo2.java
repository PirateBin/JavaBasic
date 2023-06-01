package Collection.args;

public class ArgsDemo2 {
    public static void main(String[] args) {

        //JDK5
        //可变参数
        //方法形参的个数是可以发生变化的，0 1 2 3...
        //格式：属性类型...名字
        //int...args
        /*
            方法的形参中最多只有一个可变参数
            如果方法除了可变参数外还有其他参数，那么可变参数要写在最后

         */

        int sum=getSum(1,2,3,4,5,6,7,8,9);
        System.out.println(sum);

    }

    //底层：
    //可变参数就是一个数组
    //只不过是Java帮我们创建好
    public static int getSum(int...args){
        //System.out.println(args);  //[I@4f3f5b24
        int sum=0;
        for(int i:args){
            sum+=i;
        }

        return sum;
    }
}
