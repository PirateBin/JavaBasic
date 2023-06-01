package Math;
//判断质素代码
public class MathDemo3 {
    public static void main(String[] args) {
//判断一个数是否为质数
        System.out.println(isprime(997));
    }


    public static boolean isprime(int number) {
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
