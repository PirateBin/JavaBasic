package io.zipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Debug {
    public static void main(String[] args) throws IOException{
        //1.创建一个File表示要解压的压缩包
        File src = new File("D:\\java\\FileTest\\Test\\ZipTest.zip");
        //2.创建一个File表示解压的目的地
        File dest = new File("D:\\java\\FileTest\\Test");
        unzip(src,dest);


    }

    public static void unzip(File src, File dest) throws IOException {
        //解压的本质：把压缩包里面的每一个文件或者文件夹读取出来，按照层级拷贝到目的地中

        //创建一个解压流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        //先获取到压缩包里面每一个zipentry对象
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);
            String name = entry.getName();
            //System.out.println(name);
        }
        zip.closeEntry();
        zip.close();
    }
}
