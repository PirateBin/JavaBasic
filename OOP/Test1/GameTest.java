package OOP.Test1;

public class GameTest {
    public static void main(String [] args){
        //创建第一个角色
        Role r1=new Role("乔峰",100);
        //创建第二个角色
        Role r2=new Role("鸠摩智",100);

        //开始格斗 回合制游戏
        while(true){
            //r1开始攻击r2
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println((r1.getName()+"KO了"+r2.getName()));
                break;
            }

            //r2开始攻击r1
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"KO了"+r1.getName());
                break;
            }

        }
    }
}
