package System.object;

public class ObjectDemo1 {
    public static void main(String[] args) {
        //toString() 返回对象的字符串表示形式
        Object obj=new Object();
        String str1=obj.toString();
        System.out.println(str1);  //java.lang.Object@7ef20235  类名＋地址值
        //如果我们打印一个对象，想要看到属性值的话，那么就重写toString方法就可以



    }
}
