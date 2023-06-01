package OOP.Homework;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Car[] arr=new Car[3];

        for(int i=0;i<arr.length;i++){
            Car car=new Car();
            System.out.println("请输入品牌");
            String brand=sc.next();
            car.setBrand(brand);

            System.out.println("请输入价格");
            int price=sc.nextInt();
            car.setPrice(price);

            System.out.println("请输入颜色");
            String color=sc.next();
            car.setColor(color);

            arr[i]=car;
        }

        for(int i=0;i<arr.length;i++) {
            Car car=arr[i];
            System.out.println("汽车的品牌为" + arr[i].getBrand()+","+"价格为"+arr[i].getPrice()+"颜色为"+arr[i].getColor());
        }
    }
}
