package io.test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹
        //D:\java\FileTest\Test\mks1    拷贝到     D:\java\FileTest\Test\mks1copy

        //1.创建对象表示数据源
        File mks1 = new File("D:\\java\\FileTest\\Test\\mks1");
        //2.创建对象表示目的地
        File mks1copy = new File("D:\\java\\FileTest\\Test\\mks1copy");

        //3.调用方法开始拷贝
        copy(mks1, mks1copy);

    }

    private static void copy(File file, File filecopy) throws IOException {
        //判断是否有filecopy这个文件夹，如果没有则创建
        filecopy.mkdirs();

        //递归
        //1.进入数据源
        //2.遍历数组
        //3.判断文件，拷贝
        //4.判断文件夹，递归

        File[] files = file.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    //拷贝
                    FileInputStream fis=new FileInputStream(f);
                    //拷贝到filecopy文件夹里，在文件夹里创建一个与f文件同名的文件
                    FileOutputStream fos=new FileOutputStream(new File(filecopy,f.getName()));

                    //定义字节数组
                    byte[] bytes=new byte[1024*1024*5];
                    //拷贝
                    int len;
                    while((len=fis.read(bytes))!=-1){
                        fos.write(bytes,0,len);
                    }

                    fos.close();
                    fis.close();

                } else {
                    //如果是文件夹，递归
                    copy(f,new File(filecopy,f.getName()));
                }
            }
        }


    }
}
