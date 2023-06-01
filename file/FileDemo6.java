package file;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        /*
            public File[] listFiles()       获取当前该路径下的所有内容（包括隐藏文件）,并放到数组中
            当调用者File表示的路径是需要权限才能访问的文件夹时，返回null

         */

        File f=new File("D:\\java\\FileTest");
        File[] arr=f.listFiles();
        for(File file:arr){
            System.out.println(file);
        }

    }
}
