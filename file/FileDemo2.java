package file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {

        /*
            public boolean isDirectory()        判断此路径名表示的File是否为文件夹
            public boolean isFile()             判断此路径名表示的File是否为文件
            public boolean exists()             判断此路径名表示的File是否存在

         */

        File f1=new File("D:\\java\\FileTest");
        System.out.println(f1.isDirectory());   //true
        System.out.println(f1.isFile());        //false
        System.out.println(f1.exists());        //true


    }
}
