package OOP.Test6;

public class Query {
    public static void main(String [] args){
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 22);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //先找到id为2的学生的索引
        int index=getIndex(arr,4);

        //判断索引
        if(index>=0){
            //存在，则将他的年龄+1
            Student stu=arr[index];
            int newAge=stu.getAge()+1;
            stu.setAge(newAge);
            //遍历数组
            PrintArr(arr);
        }else{
            //不存在，则直接提示
            System.out.println("当前id不存在，修改失败");
        }
    }

    public static int getIndex(Student [] arr,int id){
        for(int i=0;i<arr.length;i++){
            Student stu=arr[i];
            if(stu!=null){
                int index=stu.getId();
                if(index==id){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void PrintArr(Student[] arr){
        for(int i=0;i<arr.length;i++){
            Student stu=arr[i];
            if(stu!=null){
                System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge());
            }
        }
    }
}

