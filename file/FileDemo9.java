package file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo9 {
    public static void main(String[] args) {

        //public File[] listFiles(FileFilter filter)          利用文件名过滤器获取当前路径下所有内容
        //public File[] listFiles(FilenameFilter filter)      利用文件名过滤器获取当前路径下所有内容

        File f=new File("D:\\");
        File[] arr=f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isFile() && file.getName().endsWith(".txt");
            }

        });

        System.out.println(Arrays.toString(arr));

        /*
        File[] arr2=f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                File f2=new File(file,s);
                return f2.isFile()&&f2.getName().endsWith(".txt");
            }
        });

         */

        File[] arr2=f.listFiles((file,s)->{
            File f2=new File(file,s);
            return f2.isFile() && s.endsWith(".txt");
        });

        System.out.println(Arrays.toString(arr2));


    }
}
