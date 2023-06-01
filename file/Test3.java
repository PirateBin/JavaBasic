package file;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {

        /*
            找到电脑中所有以.txt结尾的文件

            套路：
                1.进入文件夹
                2.遍历数组
                3.判断
                4.判断
         */


        findTXT();



    }

    public static void findTXT(){
        //获取本地所有盘符
        File[] arr=File.listRoots();
        //遍历获得每个磁盘
        for(File f:arr){
            findTXT(f);
        }
    }

    public static void findTXT(File src){

        //进入文件夹src
        File[] files=src.listFiles();

        //判断文件夹是否非空
        if(files!=null) {
            //遍历数组
            for (File file : files) {

                //3.判断，如果是文件，就可以执行题目的业务逻辑
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    System.out.println(file);
                } else {
                    //4.判断，如果是文件夹，就可以递归
                    //细节：再次调用本方法的时候，参数一是src的次一级路径
                    findTXT(file);
                }

            }

        }
    }



}
