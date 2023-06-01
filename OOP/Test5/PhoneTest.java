package OOP.Test5;

public class PhoneTest {
    public static void main(String [] args){
        //创建一个数组
        Phone[] arr=new Phone[3];

        //创建手机的对象
        Phone p1=new Phone("小米",1999,"white");
        Phone p2=new Phone("华为",2999,"blue");
        Phone p3=new Phone("苹果",4799,"grey");

        //把手机对象添加到数组中
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;

        int sum=0;
        //获取三部手机的平均价格
        for(int i=0;i< arr.length;i++){
            Phone phone=arr[i];
            sum=sum+phone.getPrice();
        }

        //求平均值
        int avg=sum/arr.length;
        double avg2=sum*1.0/ arr.length;
        System.out.println(avg2);
    }
}
