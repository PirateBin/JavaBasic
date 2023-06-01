package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo7 {
    public static void main(String[] args) {
        /*
            public static File[] listRoots()                    列出可用的文件系统根
            public String[] list()                              获取当前该路径下所有内容
            public String[] list(FilenameFilter filter)         利用文件名过滤器来获取该路径下所有内容
            public File[] listFiles()                           获取当前该路径下所有内容
            public File[] listFiles(FileFilter filter)          利用文件名过滤器获取当前路径下所有内容
            public File[] listFiles(FilenameFilter filter)      利用文件名过滤器获取当前路径下所有内容

         */

        //1.listRoots 获取系统的所有盘符
        File[] arr=File.listRoots();
        System.out.println(Arrays.toString(arr));

        //2.list()  获取当前该路径所有内容（仅仅能获取名字）
        File f1=new File("D:\\java\\FileTest");
        String[] arr2=f1.list();
        for(String s:arr2){
            System.out.println(s);
        }

        //3.public String[] list(FilenameFilter filter)         利用文件名过滤器来获取该路径下所有内容
        //需求：获取D盘内所有txt的文件
        File f2=new File("D:\\");
        /*
        String[] arr3=f2.list(new FilenameFilter() {
            @Override
            //参数1：表示父级路径
            //参数2：表示子级路径
            public boolean accept(File dir, String name) {
                //拼接父级路径和子级路径
                File src=new File(dir,name);
                return src.isFile()&&name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));

         */


        String[] arr3=f2.list(new GetTxtDirectory()::isTxtDirectory);
        System.out.println(Arrays.toString(arr3));

    }
}
