package exception;

public class Student2 {
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String str){
        String[] arr=str.split(",");
        this.name=arr[0];
        this.age=Integer.parseInt(arr[1]);

    }

    public Student2(String name, int age) {
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
        if(age<18||age>20) {
            throw new RuntimeException();
        }else{
            this.age=age;
        }
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + "}";
    }
}
