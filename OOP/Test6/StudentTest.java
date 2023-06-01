package OOP.Test6;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 22);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //再添加一个学生对象，并在添加的时候进行学号的唯一性判断

        Student stu4 = new Student(4, "zhaoliu", 26);

        //唯一性判断
        //当前已存在 不用添加
        //不存在 把学生对象加入数组
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("当前ID已存在");
        } else {
            //把stu4添加到数组中
            //数组已经存满 ， 只能创建一个新的数组，新数组的长度=老数组+1
            //数组没蛮，直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                //已经存满
                //创建一个新数组，长度=老数组长度+1
                //把老数组的元素拷贝到新数组中
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;

                PrintArr(newArr);

            } else {
                //没有存满
                //[stu1,stu2,null]
                //getCount获取到的是2，表示数组中已经有了两个元素
                //下次添加数据，就添加到2索引的位置
                arr[count] = stu4;
                PrintArr(arr);

            }
        }
    }

            //创建一个新数组，长度=老数组长度+1
            //把老数组元素拷贝到新数组中
            public static Student[] createNewArr(Student[] arr){
                Student[] newArr = new Student[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                return newArr;
            }



        //定义一个方法，判断数组中存了几个元素
        public static int getCount(Student[] arr){
            //定义一个计数器用来统计
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    count++;
                }
            }
            return count;
        }

        //我要干嘛  唯一性判断
        //我干这件事，什么才能能完成  数组id
        //条用是否需要继续使用方法的结果  必须返回
        public static boolean contains(Student[]arr,int id){
            for (int i = 0; i < arr.length; i++) {
                Student stu = arr[i];
                if (stu != null) {
                    int sid = stu.getId();
                    if (sid == id) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void PrintArr(Student [] arr){
        for(int i=0;i<arr.length;i++){
            Student stu=arr[i];
            if(arr!=null){
                System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge());
            }
        }
    }


}




