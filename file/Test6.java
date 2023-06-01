package file;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {

        //统计一个文件夹的总大小

        File file=new File("D:\\java\\FileTest");
        System.out.println(getLen(file));

    }

    //统计一个文件夹的总大小
    //返回值为文件夹的总大小
    public static long getLen(File src){
        //定义变量进行累加
        long len=0;
        //进入src文件夹
        File[] files=src.listFiles();
        if(files!=null){
            //遍历数组
            for(File file:files){
                //判断
                if(file.isFile()){
                    //我们就把当前文件的大小累加到len中
                    len=len+file.length();
                }else{
                    //判断，如果是文件夹就递归
                    //递归之后需要再加上本次的len
                    len=len+getLen(file);
                }
            }

        }

        return len;
    }
}
