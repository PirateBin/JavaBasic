package API.packeging.integer;

public class IntegerDemo2 {
    public static void main(String[] args) {


        //包装类如何进行计算
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);

        //把两个数据相加
        //对象之间不能之间计算
        //步骤：
        //1.把对象进行拆箱，变成基本数据类型
        //2.相加
        //3.把得到的结果再次进行装箱

        int result = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(result);
        System.out.println(i3);

    }
}
