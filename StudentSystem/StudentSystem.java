package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_STUDENT="1";
    private static final String DELETE_STUDENT="2";
    private static final String UPDATE_STUDENT="3";
    private static final String QUERY_STUDENT="4";
    private static final String EXIT_STUDENT="5";

    //创建一个静态代码块
    //创建一个集合存储学生信息
    static ArrayList<Student> list=new ArrayList<>();
    static {
        list.add(new Student("001","lin",18,"xiamen"));
    }


    public static void startStudentSystem( ) {

        loop:while (true) {
            System.out.println("----------欢迎来到学生管理系统------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出学生");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT_STUDENT -> {
                    System.out.println("退出");
                    //break loop;
                    System.exit(0); //停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Student stu=new Student();
            System.out.println("添加学生");
            Scanner sc = new Scanner(System.in);
            String id;

            while(true){
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag ) {
                //id已经存在，需要重新录入
                System.out.println("用户id已存在,请重新录入");
            } else {
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name=sc.next();
        stu.setName(name);

        System.out.println("请输入学生的年龄");
        int age=sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生的住址");
        String address=sc.next();
        stu.setAddress(address);

        list.add(stu);

        //提示用户
        System.out.println("学生信息添加成功");

    }

    //判断id是否已经存在
    public static boolean contains(ArrayList<Student> list,String id) {
        //循环遍历集合得到每个学生对象
        //得到学生对象用用学生对象id进行判断
        //存在返回true
        /*
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return true;
            }
        }
        return false;

         */

        return getIndex(list,id)>=0;
    }

    //通过id获取索引的方法
    public static int getIndex(ArrayList<Student> list,String id){
        //遍历集合
        for(int i=0;i<list.size();i++){
            Student s=list.get(i);
            //得到每个学生对象的id
            if(s.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }



    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("删除学生");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id=sc.next();
        //查询id再list中的索引
        int index=getIndex(list,id);
        //对index进行判断
        //如果-1表示不存在结束方法，返回初始菜单
        //如果>=0表示存在，则删除
        if(index>=0){
            list.remove(index);
            System.out.println("id为"+id+"的学生删除成功");
        }else{
            System.out.println("id不存在，删除后失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("修改学生");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的的学生id");
        String id=sc.next();

        int index=getIndex(list,id);

        if(index==-1){
            System.out.println("要修改的id"+"id"+"不存在");
            return;
        }

        //当代码执行到这，说明id存在
        //获取要修改的id对象
        Student s=list.get(index);
        //输入其他的信息并修改
        System.out.println("请输入修改的学生姓名");
        String newname=sc.next();
        s.setName(newname);

        System.out.println("请输入修改的学生年龄");
        int newage=sc.nextInt();
        s.setAge(newage);

        System.out.println("请输入修改的学生地址");
        String newaddress=sc.next();
        s.setName(newaddress);

        System.out.println("学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("查询学生");
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
        }

        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        //集合中有数据
        for(int i=0;i<list.size();i++) {
            Student stu = list.get(i);

                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());

        }

    }
}
