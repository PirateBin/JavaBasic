package file;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {


        //public File[] listFiles()                           获取当前该路径下所有内容

        //1.创建File对象
        File f=new File("D:\\");
        //2.需求：打印里面所有txt文件
        File[] arr=f.listFiles();
        for(File file:arr){
            //file依次表示D盘里每个文件或者文件夹路径
            if(file.isFile()&&file.getName().endsWith(".txt"))
                System.out.println(file);
        }

    }
}
