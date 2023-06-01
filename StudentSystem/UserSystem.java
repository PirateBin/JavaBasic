package StudentSystem;

import java.awt.*;
import java.lang.reflect.Array;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class UserSystem {

    static ArrayList<User> list=new ArrayList<>();

    static{
        //添加一些初始用户信息
        User u=new User("zhangsan","qwer123","350524000000000000","18250000000");
        list.add(u);

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1、登录  2、注册  3、忘记密码");
            String choose=sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetpassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");

            }
        }


    }

    //注册
    public static void register(ArrayList<User> list){
        //把用户信息放入用户对象中
        //把用户对象添加到集合中
        //开发细节；先验证格式是否正确，再验证是否唯一
        //因此在以后的所有数据，都是存在数据库中，如果我们要校验，需要使用网络资源
        Scanner sc=new Scanner(System.in);
        String username;
        String pd;
        String id;
        String phone;
        //键盘录入用户名
        while(true) {
            System.out.println("请输入要注册的用户名：");
            username = sc.next();
            //校验用户名
            boolean flag1 = userlengthcheck(username);
            if (!flag1) {
                System.out.println("用户名格式不满足条件，需要重新输入");
                continue;
            }
            //校验用户名是否唯一
            boolean flag2 = contains(list, username);
            if (flag2) {
                //用户名已存在,那么当前用户名无法注册，需要重新输入
                System.out.println("用户名" + username + "已存在，请重新输入");
            } else {
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        //键盘录入密码
        while(true) {
            System.out.println("请输入要注册的密码");
            pd = sc.next();
            System.out.println("请再次输入要注册的密码");
            String pd2 = sc.next();
            if (!(pd.equals(pd2))) {
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }else{
                System.out.println("两次密码一致，继续录入其他信息");
                break;
            }
        }

        //键盘录入身份证号码
        while(true) {
            System.out.println("请输入要注册的身份证号码");
            id = sc.next();
            boolean flag = idcheck(id);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码格式有误，请重试输入");
                continue;
            }
        }

        //键盘录入手机号码
        while(true) {
            System.out.println("请输入要注册的电话号码");
            phone = sc.next();
            boolean flag=phonecheck(phone);
            if(!flag){
                System.out.println("手机号码格式不正确，请重新输入");
                continue;
            }else{
                System.out.println("手机号码输入成功");
                break;
            }
        }

        //创建用户对象
        User u=new User(username,pd,id,phone);
        list.add(u);
        System.out.println("注册成功");

        //遍历集合
        printList(list);

    }

    private static void printList(ArrayList<User> list){
        for(int i=0;i<list.size();i++){
            User u=list.get(i);
            System.out.println(u.getUsername()+","+u.getPassword()+","+u.getId()+","+u.getPhone());
        }
    }
    //用户名唯一方法
    public static boolean contains(ArrayList<User> list,String username){
        for(int i=0;i<list.size();i++){
            User u=list.get(i);
            if(u.getUsername().equals(username)){
                System.out.println("用户名已存在");
                return true;
            }
        }
        return false;
    }

    //用户名长度必须在3~15之间方法
    public static boolean userlengthcheck(String username) {
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char d = username.charAt(i);
            if ((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }



    //身份证验证方法
    public static boolean idcheck(String id) {
        if (id.length() != 18) {
            return false;
        }
        //不能以0开头
        if (id.startsWith("0")) {
            return false;
        }
        //前17位为数字
        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        char endchar = id.charAt(id.length() - 1);
        if (!(endchar >= '0' && endchar <= '9' || (endchar == 'X') || (endchar == 'x'))) {
            return false;
        } else {
            return true;
        }
    }

    //手机号码验证
    public static boolean phonecheck(String phone){
        if(phone.length()!=11){
            return false;
        }
        if(phone.startsWith("0")){
            return false;
        }
        for(int i=0;i<phone.length();i++){
            char c=phone.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        return true;
    }

    //登陆
    public static void login(ArrayList<User> list){
        System.out.println("登陆");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            //判断用户名是否存在
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "未注册,请先组成再登陆");
                return;
            }

            System.out.println("请输入密码");
            String password = sc.next();

            //判断验证码是否正确
            while (true) {
                String rightcode = getCode();
                System.out.println("当前正确的验证码为" + rightcode);
                System.out.println("请输入验证码：");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightcode)) {
                    System.out.println("验证码输入正确");
                    break;
                } else {
                    System.out.println("验证码错误!");
                    continue;
                }
            }


            //验证用户名和密码是否正确
            //集合中是否包含用户名和密码
            //定义一个方法验证用户名和密码是否正确

            //封装思想应用：
            //把零散的数据，封装成一个对象
            User useInfo = new User(username, password, null, null);
            boolean result = chekUserInfo(list, useInfo);
            if (result) {
                System.out.println("登陆成功，可以开始使用学生管理系统");

                //创建对象调用方法，启动学生管理系统
                StudentSystem ss=new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                System.out.println("登陆失败，用户名或密码错误");
                if(i==2){
                    System.out.println("当前账号"+username+"被锁定");
                    return;
                }else{
                    System.out.println("用户名或密码错误,还剩下"+(2-i)+"次机会");
                }
            }
        }
    }

    //判断用户名和密码是否正确
    public static boolean chekUserInfo(ArrayList<User> list,User useInfo){
        for(int i=0;i<list.size();i++){
            User u=list.get(i);
            if(u.getUsername().equals(useInfo.getUsername())&&u.getPassword().equals(useInfo.getPassword())){
                return true;
            }
        }
        return false;
    }

    //生成验证码
    public static String getCode(){
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }

        //随机抽取4个字符
        Random rand=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++) {
            //获取随机索引
            int index = rand.nextInt(list.size());
            //利用随机索引获取字符
            //拼接
            char c=list.get(index);
            //把随机字符添加到sb中
            sb.append(c);
        }

        //把一个随机数字添加到末尾
        int number=rand.nextInt(10);
        sb.append(number);

        //如果我们要修改字符串中的内容
        //先把字符串变成字符数组，在数组中修改，然后再创建一个新的字符串
        char[] arr=sb.toString().toCharArray();
        //拿最后一个索引，跟随机索引进行交换
        int randomIndex=rand.nextInt(arr.length);
        //最大索引指向的元素，和随机索引指向的元素交换
        char temp=arr[randomIndex];
        arr[randomIndex]=arr[arr.length-1];
        arr[arr.length-1]=temp;



        return new String(arr);
    }


    //忘记密码
    public static void forgetpassword(ArrayList<User> list){
        System.out.println("忘记密码");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=sc.next();

        //先把用户对象的索引获取
        boolean flag=contains(list,username);
        if(!flag){
            System.out.println("当前用户”+username"+"未注册");
            return;
        }

        System.out.println("请输入身份证号码：");
        String id=sc.next();

        System.out.println("请输入手机号码：");
        String phone=sc.next();


        //先把用户对象索引获取出来

            int index = FindIndex(list, username);
            User u = list.get(index);
            if (!(u.getId().equals(id) && u.getPhone().equals(phone))) {
                System.out.println("身份证号码或手机号码输入有误");
                return;
            }
        String newpassword;
        String againnewpassword;
        while(true) {
            System.out.println("验证通过，请输入新的密码：");
            newpassword = sc.next();
            System.out.println("请在此输入密码：");
            againnewpassword = sc.next();
            if (newpassword.equals(againnewpassword)) {
                System.out.println("两次密码输入一致");
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入：");
                continue;
            }
        }
        //直接修改
        u.setPassword(newpassword);
        System.out.println("密码修改成功");

    }

    //获取用户对象的索引
    public static int FindIndex(ArrayList<User> list,String username){
        for(int i=0;i<list.size();i++){
            User u=list.get(i);
            if(u.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }
}
