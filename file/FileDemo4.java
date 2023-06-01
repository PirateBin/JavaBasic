package file;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {

        /*
            public boolean crateNewFile()       创建一个新的空文件
            public boolean mkdir()              创建单级文件夹
            public boolean mkdirs()             创建多级文件夹
            public boolean delete()             删除文件、空文件夹
         */

        //createNewFile
        //如果当前路径表示的文件不存在，则成功创建，方法返回true
        //如果当前路径表示的文件存在，则创建失败，方法返回false
        //如果父级路径不存在的，那么方法会有IOException
        //createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
         File f1=new File("D:\\java\\FileTest\\b.txt");
         boolean b=f1.createNewFile();
        System.out.println(b);      //true


        //mkdir  make Directory 文件夹（目录）
        //细节1：windows当中的路径是唯一的，如果当前路径已经存在，则创建失败，返回false
        //细节2：mkdir方法只能创建单级文件夹，不能创建多级文件夹
        File f2=new File("D:\\java\\FileTest\\mk");
        boolean m1=f2.mkdir();
        System.out.println(m1);

        //mkdirs
        //细节：既可以创建单级，又可以创建多级文件夹
        File f3=new File("D:\\java\\FileTest\\mks1\\mks2\\mks3");
        boolean m2=f3.mkdirs();
        System.out.println(m2);




    }
}
