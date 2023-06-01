package proOOP.mystatic01;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public Student() {
    }


    public Student(String name, int age, String gender, String teacherName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.teacherName = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void study(){
        System.out.println(name+"正在学习");
    }

    public void show(){
        System.out.println(name+","+age+","+gender+","+teacherName);
    }

    /**
     * 获取
     * @return teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置
     * @param teacherName
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

}
