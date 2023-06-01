package System.object;

public class Objects {
    //Objects.equals(s1,s2)
    //方法的底层会判断s1是否为null，如果是返回fasle
    //如果s1不是null，那么利用s1调用equals方法
    //如果此时s1是Student类型，所以最终还是调用Student中equals中方法
    //如果没有重写，则是比较地址值，重写就是比较属性值

    //Object.isNull()
    //Object.nonNull()
}
