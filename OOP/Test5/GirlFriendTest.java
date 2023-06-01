package OOP.Test5;

public class GirlFriendTest {
    public static void main(String [] args){
        //定义数组存储
        GirlFriend[] arr=new GirlFriend[4];

        //创建女朋友对象
        GirlFriend gf1=new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gf2=new GirlFriend("小丹丹",19,"憨妹子","睡觉");
        GirlFriend gf3=new GirlFriend("小慧慧",20,"女汉子","打游戏");
        GirlFriend gf4=new GirlFriend("小倩倩",21,"辣妹","跳舞");

        //把对象添加到数组中
        arr[0]=gf1;
        arr[1]=gf2;
        arr[2]=gf3;
        arr[3]=gf4;

        //求和
        int sum=0;
        for(int i=0;i< arr.length;i++){
            GirlFriend gf=arr[i];
            sum=sum+gf.getAge();
        }

        //平均值
        int avg=sum/ arr.length;
        System.out.println(avg);

        //统计年龄比平均值低的，打印信息
        int count=0;
        for(int i=0;i<arr.length;i++){
            GirlFriend gf=arr[i];
            if(gf.getAge()<avg){
                count++;
                System.out.println(gf.getName()+","+gf.getAge()+","+gf.getGender()+","+gf.getHobby());
            }
        }
        System.out.println(count+"个");
    }
}
