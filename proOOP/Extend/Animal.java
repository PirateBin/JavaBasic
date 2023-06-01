package proOOP.Extend;

import org.w3c.dom.ls.LSOutput;

public class Animal {

    //访问权限符：
    //private：子类无法访问
    //私有只有在本类中访问
    //子类只能访问父类非私有方法
    public void eat(){
        System.out.println("吃东西");
    }

    public void drink(){
        System.out.println("喝水");
    }


}
