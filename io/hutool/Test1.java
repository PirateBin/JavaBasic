package io.hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        /*
            FileUtil类：
                file:根据参数创建一个file对象
                touch：根据参数创建文件

                writeLines：把集合中的数据写道文件中，覆盖模式
                appendLines：把集合中的数据写出到文件中，续写模式
                readLines：按照字符编码，把文件中的数据，读到集合中
                readUtf8Lines：按照UTF-8的形式，把文件中的数据，读到集合中

                copy：拷贝文件或者文件夹
         */

        File file=FileUtil.file("D:\\","java","FileTest","hutool.txt");
        System.out.println(file);

        //如果父级路径不存在，会创建处父级路径
        File touch=FileUtil.touch("D:\\java\\FileTest\\hutool\\a.txt");
        System.out.println(touch);



        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");
        File file2=FileUtil.writeLines(list,"D:\\java\\FileTest\\hutool\\a.txt","UTF-8",true);
        System.out.println(file2);
        //追加写入
        FileUtil.appendLines(list,"D:\\java\\FileTest\\hutool\\a.txt","UTF-8");



        List<String> list1=FileUtil.readLines("D:\\java\\FileTest\\hutool\\a.txt","UTF-8");
        System.out.println(list1);
    }
}
