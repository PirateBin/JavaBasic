package file;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {

        /*
            删除一个多级文件夹
            如果我们要删除一个有内容的文件夹
            1.先删除文件夹里面所有的内容
            2.再删除自己

         */

        File file=new File("D:\\java\\FileTest\\mks1");
        delete(file);

    }

    //删除src文件夹
    public static void delete(File src){
        //1.先删除文件夹里面所有内容
        File[] files=src.listFiles();
        if(files!=null) {
            for (File file : files) {
                //如果是文件
                if (file.isFile()) {
                    file.delete();
                }else{
                    //如果是文件夹，则递归
                    delete(file);
                }
            }
        }

        //2.删除自己
        src.delete();
    }

}
