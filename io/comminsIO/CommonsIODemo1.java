package io.comminsIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        /*
            FileUtils类
            IOUtils类
         */

        //复制文件
        // FileUtils.copyFile(new File("a.txt"),new File("copy"));

        //复制文件夹
        /*

        FileUtils.copyDirectory(new File("D:\\java\\FileTest\\Test\\mks1")
                ,new File("D:\\java\\FileTest\\Test\\copy"));

         */

        //删除文件夹
        //  FileUtils.deleteDirectory(new File("D:\\java\\FileTest\\Test\\copy"));

        //清空文件夹
        //  FileUtils.cleanDirectory(new File("D:\\java\\FileTest\\Test\\copy"));


        //复制文件
        IOUtils.copy(new FileInputStream("a.txt"),new FileOutputStream("copy"));

    }
}
