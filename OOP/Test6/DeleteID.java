package OOP.Test6;

public class DeleteID {
    public static void main(String [] args){
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 22);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //找到要删除的id在数组中的索引
        int index=getIndex(arr,2);
        System.out.println(index);
        if(index>=0){
            //如果存在，则删除
            arr[index]=null;
            //遍历数组
            PrintArr(arr);
        }else{
            //如果不存在，则提示删除失败
            System.out.println("当前id不存在，删除失败");
        }

    }

    //通过id删除学生信息
    //如果存在，则删除，如果不存在，显示删除失败
    //找到id在数组中的索引
    public static int getIndex(Student [] arr,int id){
        for(int i=0;i<arr.length;i++){
            Student stu=arr[i];
            //对stu进行非空判断
            if(stu!=null){
                int sid=arr[i].getId();
                if(sid==id){
                    return i;
                }
            }
        }
        //循环结束后，不存在则返回-1
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
