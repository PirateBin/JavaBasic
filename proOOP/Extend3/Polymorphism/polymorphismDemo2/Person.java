package proOOP.Extend3.Polymorphism.polymorphismDemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void KeepPet(Dog dog,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
        dog.eat(something);
    }

    public void KeepPet(Cat cat,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
        cat.eat(something);
    }



    //一个方法能接受所有的动物

   /* public void KeepPet(Animal a,String something){
        if(a instanceof Dog d){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getColor()+"颜色的"+d.getAge()+"岁的狗");
            d.eat(something);
        }else if(a instanceof Cat c){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+c.getColor()+"颜色的"+c.getAge()+"岁的猫");
            c.eat(something);
        }else{
            System.out.println("没有这种动物");
        }

        //System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的动物");
        //a.eat(something);
    }

    */


}
