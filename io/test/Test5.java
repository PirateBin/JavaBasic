package io.test;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException{
        /*
            四种方式拷贝，并统计搁置用时
         */


        long start=System.currentTimeMillis();
        //method1();
        //method2();
        //method3();
        //method4();

        long end=System.currentTimeMillis();

        System.out.println((end-start)/1000.0+"秒");



    }

    //1.字节流，一次读一个字节
    public static void method1() throws IOException {
        FileInputStream fis=new FileInputStream("csb.txt");
        FileOutputStream fos=new FileOutputStream("copy.txt");

        int len;
        while((len=fis.read())!=-1){
            fos.write(len);
        }

        fos.close();
        fis.close();

    }

    //2.字节流，一次读一个字节数组
    public static void method2() throws IOException{
        FileInputStream fis=new FileInputStream("csb.txt");
        FileOutputStream fos=new FileOutputStream("copy");

        int len;
        byte[] bytes=new byte[8192];
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }

    //3.字节缓冲流，一次读一个字节
    public static void method3() throws IOException{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("csb.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.txt"));

        int len;
        while((len=bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
    }

    //4.字节缓冲流，一次读一个字节数组
    public static void method4() throws IOException{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("csb.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.txt"));

        int len;
        byte[] bytes=new byte[8192];
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
