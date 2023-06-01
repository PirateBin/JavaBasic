package System.object;

public class ObjectDemo2 {
    public static void main(String [] agrs){
        //public boolean equals(Object obj)  比较两个对象是否相等

        Student s1=new Student();
        Student s2=new Student();

        boolean result=s1.equals(s2);  //equals判断的是地址值是否一样
        System.out.println(result);

        //equals正常比较的是对象的地址值是否相同
        //重写后的equals比较的就说对象内部的属性值

    }
}
