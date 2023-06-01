package OOP.Test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(){
    }

    public Role(String name, int blood){
        this.name=name;
        this.blood=blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 定义一个方法用于攻击别人
    //谁攻击谁？
    // Role r1=new Role() ;
    // Role r2=new Role() ;
    // r1.攻击(r2);
    // 方法的调用者去攻击参数
    public void attack(Role role){
        //计算造成的伤害  1~20
        Random r=new Random();

        int hurt = r.nextInt( 20 )+1;

        //修改一下挨揍人的血量
        //挨揍的人的剩余血量
        int remainBlood =role.getBlood()-hurt;
        //对剩余血量做一个验证，如果为负数，就修改为0
        remainBlood =remainBlood < 0 ? 0 : remainBlood;
        //修改一下挨揍人的血量
        role.setBlood(remainBlood);


        //this 表示方法的调用者
        //System.out.println("乔峰举起了拳头，打了鸠摩智一下，造成了xx点伤害，鸠摩智还剩下xxx点血");
        System.out.println(this.getName()+"举起拳头，打了"+role.getName()+"一下,"
        +"造成了"+hurt+"点伤害，"+role.getName()+"还剩下了"+remainBlood+"点血");
    }
}
