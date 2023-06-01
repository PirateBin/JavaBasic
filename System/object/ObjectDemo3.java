package System.object;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s="abc";
        StringBuilder sb=new StringBuilder("abc");

        System.out.println(s.equals(sb));
        //equals方法是s调用的，而s是字符串
        //所以equals要看String类中的
        //字符串中equals方法，先判断参数是否为字符串
        //如果是字符串，再比较内部属性
        //如果不是字符串，直接输出false

        System.out.println(sb.equals(s));
        //因为equals方法是sb调用的，sb是StringBuilder类的
        //所以这里的equals要看StringBuilder中的
        //那么在StringBuilder中，没有重写equals方法
        //使用的是Object中的
        //Object当中默认是使用==比较两个对象的地址值
    }
}
