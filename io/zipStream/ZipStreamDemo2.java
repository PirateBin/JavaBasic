package io.zipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException{

        //1.创建File对象表示要压缩的文件
        File src=new File("D:\\java\\FileTest\\Test\\Zip.txt");

        //2.创建File对象便是压缩包的位置
        File dest=new File("D:\\java\\FileTest\\Test");

        //3.调用方法表示压缩
        toZip(src,dest);
    }

    //把src压缩到dest
    public static void toZip(File src,File dest) throws IOException {
        //创建压缩流
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"Zip.zip")));
        //创建ZipEntry对象
        ZipEntry entry=new ZipEntry("Zip.txt");
        //把ZipEntry对象放入压缩包中
        zos.putNextEntry(entry);
        //把src文件中的数据写到压缩包中
        FileInputStream fis=new FileInputStream(src);
        int b;
        while((b=fis.read())!=-1){
            zos.write(b);
        }


        zos.closeEntry();
        zos.close();


    }

}
