package file;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        /*
           public boolean delete()      删除文件夹、文件
           细节：
            如果删除的是文件，则直接删除，不走回收站
            如果删除的是空文件夹，则直接删除，不走回收站
            如果删除的是又内容的文件夹，则删除失败
         */



        File f=new File("D:\\java\\FileTest\\mk");
        boolean result1=f.delete();
        System.out.println(result1);



        File f2=new File("D:\\java\\FileTest\\a.txt");
        boolean result2=f2.delete();
        System.out.println(result2);

    }
}
