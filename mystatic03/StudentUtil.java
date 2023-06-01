package proOOP.mystatic03;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil(){}

    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        //定义一个参照物
        int max=list.get(0).getAge();

        //循环遍历
        for(int i=0;i< list.size();i++){
            Student s=list.get(i);
            if(s.getAge()>max){
                max=s.getAge();
            }
        }
        return max;
    }
}
