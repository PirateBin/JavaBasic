package dynamicproxy;

public class Test {
    public static void main(String[] args) {

        /*
            需求：外面的人想要大明星唱歌
            1.获取代理的对象
            2.调用代理的唱歌方法
         */

        BigStar bigStar=new BigStar("鸡哥");
        Star proxy=ProxyUtil.createProxy(bigStar);


        String result=proxy.sing("只因你太美");
        System.out.println(result);

        proxy.dance();

    }
}
