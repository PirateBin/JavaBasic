package Math;

import java.util.Random;

public class MathDemo1 {
    public static void main(String[] args) {
        Math.abs(-88);
        System.out.println(Math.abs(-88));

        //ceil 向上取整
        //floor 向下取整

        System.out.println(Math.ceil(9.3));
        System.out.println(Math.floor(9.3));

        //pow 获取a的b次幂
        System.out.println(Math.pow(2,3)); //8
        System.out.println(Math.pow(4.0,0.5)); //2.0
        System.out.println(Math.pow(2,-2)); //0.25

        //sqrt 开根号
        System.out.println(Math.sqrt(4));
        //cbrt 开立方根
        System.out.println(Math.cbrt(8));

        //random() 获取一个随机数[0.0,1.0）
        for(int i=0;i<5;i++) {
            System.out.println(Math.floor(Math.random()*100)+1); //[1,100]
        }

        Random r=new Random();
        int a=r.nextInt(0,50);
        System.out.println(a);
    }
}
