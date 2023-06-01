package Math;
//自幂数  三位数自幂数又称水仙花数
public class MathDemo4 {
    public static void main(String[] args) {
        //统计一共又多少水仙花数
        int count=0;
        //水仙花数：100~999

        //得到一个三位数
        for(int i=100;i<999;i++){
            int g=i%10;  //个位
            int s=i/10%10;  //十位
            int b=i/100;  //百位

            //判断每一位三次方之和与自身相比较
            double sum=Math.pow(g,3)+Math.pow(s,3)+Math.pow(b,3);   //pow函数的返回值是double类型
            if(sum==i){
                count++;
                System.out.println("水仙花数："+i);
            }
        }
        System.out.println("水仙花数有："+count+"个");
    }
}
