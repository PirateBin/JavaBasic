package io.zipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            压缩文件夹
            D:\java\FileTest\Test\ZipTest
         */

        //1.创建File对象表示要压缩的文件夹
        File src=new File("D:\\java\\FileTest\\Test\\ZipTest");
        //2.创建File对象表示压缩包放在哪里(压缩包的父级路径)
        File destParent=src.getParentFile();
        //3.创建File对象
        File dest=new File(destParent,src.getName()+".zip");
        //4.创建压缩流关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest));
        //5.获取src中每个文件，变成ZipEntry对象，放入压缩包中
        toZip(src,zos,src.getName());
        //6.释放资源
        zos.close();


    }

    //获取src中每个文件，变成ZipEntry对象，放到压缩包中
    //参数一：数据源
    //参数二：压缩流
    //参数三：压缩包内部路径
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException{
        File[] files=src.listFiles();
        for(File file:files){
            //判断
            if(file.isFile()){
                //文件,变成ZipEntry对象，放到压缩包中
                ZipEntry entry=new ZipEntry(name+"\\"+file.getName());  //name表示src的文件名，file.getName（）表示src文件里的文件名
                zos.putNextEntry(entry);
                //把文件数据写入entry中
                FileInputStream fis=new FileInputStream(file);
                int len;
                while((len=fis.read())!=-1){
                    zos.write(len);
                }
                fis.close();
                zos.closeEntry();

            }else{
                //文件夹递归
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }

}
