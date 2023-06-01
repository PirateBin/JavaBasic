package Char.StringBuilderDemo;

//StringBuilder 字符串容器

public class StringBuilderDemo3 {
    public static void main(String[] args){
        // 创建对象
        StringBuilder sb=new StringBuilder("投币");

        //添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //反转
        sb.reverse();

        //获取长度
        int len=sb.length();
        System.out.println(len);

        //打印
        //因为StringBuilder是Java已经写好的类
        //Java再底层对他做了一些特殊处理
        //打印对象不是地址值而是属性值
        System.out.println(sb);

    }
}
