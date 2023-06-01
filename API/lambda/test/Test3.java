package API.lambda.test;

public class Test3 {
    public static void main(String[] args) {
        /*
            有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个，以后每天猴子都吃当前生下来的一半，并多吃一个，
            到了第十天的时候（还没吃），发现只剩下一个桃子了，请问，最初总共多少个桃子

            day10 : 1
            day9  : (day10+1)*2=4
            day8  : (day8+1)*2=10
            ...

            1.出口
                day==10 剩下1
            2.规律
                每一天的桃子都是后一天的数量加1，乘以2

         */

        System.out.println(getInitpeach(1));


    }
    public static int getInitpeach(int day){
        if(day<=0 || day>=11){
            return -1;
        }
        if(day==10){
            return 1;
        }
        //返回后一天(day+1)的数量+1再乘以2
        return (getInitpeach((day+1))+1)*2;
    }

}
