package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        ArrayList<Phone> list=new ArrayList<>();

        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",7999);
        Phone p3=new Phone("锤子",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfoList=getPhoneInfo(list);

        //遍历数组
        for(int i=0;i<phoneInfoList.size();i++){
            Phone p=phoneInfoList.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }

    }

    //方法：返回品牌价格低于3000的手机

    //技巧：返回多个数据，可以先把数据先放到一个容器当中，再把容器返回
    //集合 数组
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义一个集合用于存储价格低于3000的手机对象
        ArrayList<Phone> resultList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Phone p=list.get(i);
            int price=p.getPrice();
            if(price<=3000){
                resultList.add(p);
            }
        }
        return resultList;
    }
}
