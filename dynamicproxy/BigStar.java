package dynamicproxy;

public class BigStar implements Star{
    private String name;


    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    @Override
    //唱歌 跳舞
    public String sing(String song){
        System.out.println(this.name+"正在唱"+song);
        return "谢谢";
    }

    @Override
    public void dance(){
        System.out.println(this.name+"正在跳舞");
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

    public String toString() {
        return "BigStar{name = " + name + "}";
    }
}
