package reflect;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public String address;

    public long Tel;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Student(String name){
        this.name=name;
    }

    private Student(int age){
        this.age=age;
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    private String eat(String something) throws IOException,NoSuchFieldError, NotBoundException {
        System.out.println("在吃"+something);
        return "奥里给";
    }


}
