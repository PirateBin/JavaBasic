package io.properties;

import cn.hutool.core.map.multi.SetValueMap;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {

        /*
            Properties跟IO流结合
         */

        //1.创建集合
        Properties prop=new Properties();

        //2.添加数据
        prop.put("aaa","bbb");
        prop.put("bbb","eee");
        prop.put("ccc","fff");
        prop.put("ddd","zzz");

        //3.把集合中的数据以键值对的形式写入本地文件
        /*

        BufferedWriter bw=new BufferedWriter(new FileWriter("properties.txt"));
        Set<Map.Entry<Object,Object>> entries=prop.entrySet();
        for(Map.Entry<Object,Object> e:entries){
            Object key=e.getKey();
            Object value=e.getValue();
            bw.write(key+"="+value);
            bw.newLine();
        }
        bw.close();

         */

        FileOutputStream fos=new FileOutputStream("properties.txt");
        prop.store(fos,"properties.txt");
        fos.close();

    }
}
