package proOOP.mystatic01;

public class StudentTest {
    public static void main(String[] args) {
        //创建第一个学生对象
        Student.teacherName="阿玮老师";
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setGender("男");
        //s1.setTeacherName("阿玮老师");

        s1.study();
        s1.show();

        //创建第二个学生对象
        Student s2=new Student();
        s2.setName("Jane");
        s2.setAge(20);
        s2.setGender("女");

        s2.study();
        s2.show();

    }

}
