package io.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class Test4 {
    public static void main(String[] args) throws IOException {

                /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
         */

        //1.读取数据
        FileReader fr=new FileReader("a.txt");
        StringBuilder sb=new StringBuilder();
        int ch;
        while((ch=fr.read())!=-1){
            sb.append(((char)ch));
        }
        fr.close();
        System.out.println(sb);

        //2.排序
        Integer[] arr=Arrays.stream(sb.toString()
                .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr));

        String s=Arrays.toString(arr).replace(", ","-");
        String result=s.substring(1,s.length()-1);
        System.out.println(result);

        //3.写出
        FileWriter fw=new FileWriter("a.txt");
        fw.write(result);

        fw.close();

    }
}
