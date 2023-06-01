package System.system;
//判断两个算法的运行速度
public class SystemDemo2 {
    public static void main(String[] args) {
        //判断1~10000之间有多少质数

        long start=System.currentTimeMillis();  //单位：毫秒

        for(int i=1;i<10000;i++){
            boolean flag=isPrime2(i);
            if(flag){
                System.out.println(i);
            }
        }

        long end= System.currentTimeMillis();
        System.out.println(end-start+"毫秒");
    }

    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int number) {
        int count = 0;
        for(int i=2;i<Math.sqrt(number);i++){
            count++;
            if(number%i==0)
                return false;
        }
        System.out.println(count);
        return true;
    }
}
