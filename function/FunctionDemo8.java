package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo8 {
    public static void main(String[] args) {

        /*
            需求：
                创建集合添加学生对象
                学生对象属性：name，age
            要求：
                获取姓名放到数组中
                使用方法引用

            技巧：
                1.有没有这样一个方法符合当前的需求
                2.如果有这个方法，这个方法是否满足引用的规则
                静态  类名::方法名
                成员方法
                构造方法
         */

        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",22));
        list.add(new Student("wangwu",24));

        /*
        list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        });

         */

        String[] arr=list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));


    }
}
