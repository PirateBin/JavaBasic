package System.object;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected Object clone(int a) 对象克隆

        //先创建一个对象
        int [] data={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1=new User(1,"george","1234qwer","animal1",data);

        //克隆对象
        //方法在底层会帮我们创建一个对象，并把对象中数据拷贝
        //细节：
        //要重写clone()方法
        //让JavaBean类实现Cloneable接口
        //创建原对象对调用
        Object u2=(User)u1.clone();

        //验证Object中的clone是深克隆还是浅克隆
        int [] arr=u1.getData();
        arr[0]=100;

        //System.out.println(u1);   //data[0]=100
        //System.out.println(u2);   //data[0]=100
        //Object中的克隆是浅克隆

        //第三方工具
        Gson gson=new Gson();
        //把对象变成一个字符串
        String s=gson.toJson(u1);
        System.out.println(s);

        //再把字符串变回对象
        User user=gson.fromJson(s,User.class);

        int [] arr1=u1.getData();
        arr1[0]=100;
        //打印对象
        System.out.println(user);
    }
}

//浅克隆
    //不管对象内部属性是基本数据类型还是引用数据类型都拷贝过来
//深克隆
    //基本数据类型拷贝
    //字符串复用 （串池）
    //引用数据类型会创建新的再克隆属性