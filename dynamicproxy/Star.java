package dynamicproxy;

public interface Star {

    //我们可以把所有像被代理的方法定义在接口中
    //代理可以无侵入式的给对象增强其他的功能
    //代理里面就是对象要被代理的方法
    //Java通过接口保证代理的样子，对象和代理需要实现同一个接口

    public abstract String sing(String song);

    public abstract void dance();
}
