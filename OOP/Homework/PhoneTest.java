package OOP.Homework;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr=new Phone[3];
        Phone p1=new Phone("华为",4000,"blue");
        Phone p2=new Phone("apple",6799,"black");
        Phone p3=new Phone("小米",2999,"white");

        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p2;


        //int average=(arr[0].getPrice()+arr[1].getPrice()+arr[2].getPrice())/3;
        //System.out.println(average);

        int sum=0;
        for(int i=0;i<arr.length;i++){
            Phone p=arr[i];
            sum+=arr[i].getPrice();
        }

        double avg=sum*1.0/arr.length;
        System.out.println(avg);
    }

}
