package Algorithm.sort;

public class RecursionDemo1 {
    public static void main(String[] args) {

        //利用递归球1~100之间的和

        getSum(100); //5050

        //找出口


    }

    public static int getSum(int number){
        //如果number==1
        if(number==1){
            return number;
        }
        //如果number不是1
        return number+getSum(number-1);
    }
}
