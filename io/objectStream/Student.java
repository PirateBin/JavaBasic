package io.objectStream;

import java.io.Serial;
import java.io.Serializable;


/*
    Serializable接口里面是没有抽象方法的，标记型接口
    一旦实现了这个接口，那么就表示当前的Student类可以被序列号

    理解：
        表示一个物品的合规性

    细节：
        1.使用序列号流将对象写到文件时，需要让Javabean类实现Serializable接口，否则会出现NotSerializableException异常
        2.序列号流写到文件中的数据不能修改，一旦修改就无法再次读回
        3.序列号对象后，修改Javabean类，再次反序列化，会不会有问题？
            会出问题，会抛出InvalidClaasException异常
            解决方法：给Javabean类添加serialVersionUID（序列号/版本号）
        4.如果一个对象中的某个成员变量的值不想被序列化，该如何实现？
            解决方法：给该成员变量加transient关键字修饰,该关键字标记的成员变量不参与序列化过程



 */


public class Student implements Serializable {

    //定义序列号（版本号）
    @Serial
    private static final long serialVersionUID = -6525658954534218361L;


    private String name;
    private int age;

    //transient
    //不会把成员序列号到版本号中
    private transient String address;


    public Student() {
    }

    public Student( String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return  " name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
