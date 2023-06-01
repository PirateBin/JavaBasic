package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionDemo9 {
    public static void main(String[] args) {

        /*
            需求：
                创建集合添加学生对象
                学生对象属性：name，age

            要求：
                把姓名和年龄拼接成:张三-23的字符串，并放到数组中
                使用方法引用完成

         */

        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",22));
        list.add(new Student("wangwu",21));

        list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        });


        String[] arr=list.stream().map(Student::SimpleNameAge).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));


    }
}
