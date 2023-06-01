package file;

import API.date.JDK8Date.LocalDateDemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) {

        /*
            public long length()                返回文件的大小（字节数量）
            public String getAbsolutePath()     返回文件的绝对路径
            public String getPath()             返回定义文件时使用的路径
            public String getName()             返回文件的名称，带后缀
            public long lastModified()          返回文件的最后修改时间（时间毫秒值）

         */

        File f1=new File("D:\\java\\FileTest\\a.txt");

        //length()无法获取文件夹的大小
        //如果我们要获取一个文件的大小，需要把这个文件里所有的文件大小都累加在一起
        System.out.println(f1.length());        //0

        System.out.println(f1.getAbsoluteFile());       //D:\java\FileTest\a.txt

        System.out.println(f1.getPath());           //D:\java\FileTest\a.txt

        System.out.println(f1.getName());           //a.txt

        System.out.println(f1.lastModified());          //1681879321659

        Date time=new Date(f1.lastModified());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(time));   //2023年04月19日 14:03:06


    }
}
