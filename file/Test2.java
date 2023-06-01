package file;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {

        /*
            定义一个方法，判断某个文件夹中是否有以.txt结尾的电影
         */

        File f=new File("D:\\java\\FileTest\\Test");

        System.out.println(haveAVIfilm(f));

    }

    public static boolean haveAVIfilm(File f){
        //获取f文件夹里面所有内容
        File[] arr=f.listFiles();
        //遍历数组获取元素
        for(File file:arr){
            if(file.isFile() && file.getName().endsWith(".txt"))
                return true;
        }
        return false;
    }


}
