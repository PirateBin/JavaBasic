package API.packeging.integer;

public class IntegerDemo3 {
    public static void main(String[] args) {

        //JDK5的时候提出了一个机制：自动装箱和自动拆箱

        Integer i1=10;
        //在底层，此时会自动去调用静态方法valueOf得到一个Integer对象，只不过这个动作不需要我们去操作

        Integer i2=new Integer(10);
        //自动拆箱的动作
        int i=i2;

        //在JDK5之后，int和Integer可以看做同一个东西，因为在内部可以自动转化




    }
}
