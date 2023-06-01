package file;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {

        /*
            先创建一个Test文件夹，再在文件夹中中创建一个a.txt文件
         */

        File f=new File("D:\\java\\FileTest\\Test");

        boolean result=f.mkdirs();

        File src=new File(f,"a.txt");
        boolean result1=src.createNewFile();
        System.out.println(result1);



    }
}
