package API.lambda.test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        /*
            定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
            要求1：属性有姓名，年龄，身高
            要求2：按照年龄的大小排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序

         */

        //1.创建三个女朋友对象
        GirlFriend gf1=new GirlFriend("小诗诗",18,165);
        GirlFriend gf2=new GirlFriend("小甜甜",18,164);
        GirlFriend gf3=new GirlFriend("小丹丹",20,167);

        //2.定义数组存储女朋友对象
        GirlFriend[] arr={gf1,gf2,gf3};

        //3.利用Arrays中的sort方法进行排序
        //匿名内部类  lambda表达式
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                //按照年龄的大小排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
                double temp=o1.getAge()-o2.getAge();

                temp = temp ==0 ? o1.getHeight()-o2.getHeight() : temp;

                //compareTo()方法可以比较字母
                temp = temp ==0 ? o1.getName().compareTo(o2.getName()) : temp;

                if(temp>0){
                    return 1;
                }else if(temp<0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        //lambda表达式
        Arrays.sort(arr,(o1,o2)->{
            //按照年龄的大小排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
            double temp=o1.getAge()-o2.getAge();

            temp = temp ==0 ? o1.getHeight()-o2.getHeight() : temp;

            //compareTo()方法可以比较字母
            temp = temp ==0 ? o1.getName().compareTo(o2.getName()) : temp;

            if(temp>0){
                return 1;
            }else if(temp<0){
                return -1;
            }else{
                return 0;
            }

        });

        //4.展示一些数组中的内容
        System.out.println(Arrays.toString(arr));

    }
}

class GirlFriend{
    private String name;
    private int age;
    private double height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
