package io.integrateTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) throws IOException {
        /*
            点名器：每次被点到的学生，再次被点到的概率在原先的基础上降低一半
            核心：带权重的随机
         */

        //1.去把文件中所有的学生信息读取到内存中
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("WRA"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            Student stu = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        //2.计算权重的总和
        double weight = 0.0;
        for (Student s : list) {
            weight += s.getWeight();
        }

        //3.计算出每个人的实际占比
        double[] arr = new double[list.size()];
        int index = 0;
        for (Student s : list) {
            arr[index] = s.getWeight() / weight;
            index++;
        }

        //4.计算每个人的权重占比范围
        //用数组存储
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }

        //5.随机抽取
        //获取一个0.0~1.0的随机数
        double number=Math.random();
        //判断number在arr中的位置
        //方法返回： - 插入点 -1
        int index2= - Arrays.binarySearch(arr,number) -1 ;

        Student s=list.get(index2);
        System.out.println(s);

        //6.修改当前学生的权重
        double w= s.getWeight()/2;
        s.setWeight(w);

        System.out.println(list);

        //7.把集合中的数据再次写入文件中
        BufferedWriter bw=new BufferedWriter(new FileWriter("WRA"));
        for(Student stu:list){
            bw.write(stu.toString());
            bw.newLine();
        }
        bw.close();


    }
}
