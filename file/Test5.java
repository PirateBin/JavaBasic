package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {

        /*
            统计一个文件夹中每种文件的个数并打印（考虑子文件）

            File 递归 Map集合(键：文本文件 ，值：次数)
         */
        File f=new File("D:\\java\\FileTest");
        HashMap<String,Integer> map=countFile(f);
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for(Map.Entry<String,Integer> e:entries){
            System.out.println(e.getKey()+"="+e.getValue());
        }



    }

    //统计一个文件夹中每种文件的个数
    //返回值
        //用来统计map集合
        //键：后缀名  值：次数
    /*
        a.txt
        a.a.txt
        aaa
     */
    public static HashMap<String,Integer> countFile(File src){
        //定义集合来统计
        HashMap<String,Integer> map=new HashMap<>();


        File[] files=src.listFiles();
        //如果数组不为null
        if(files!=null){
            //遍历files数组，获取数组中每个文件夹或文件
            for(File file:files){
                //判断是否为文件
                if(file.isFile()){
                    //如果是文件，就统计
                    String name=file.getName();
                    String[] arr=name.split("\\.");
                    if(arr.length>=2){
                        String endName=arr[arr.length-1];
                        if(map.containsKey(endName)){
                            int count=map.get(endName);
                            count++;
                            map.put(endName,count);
                        }else{
                            map.put(endName,1);
                        }
                    }
                }
                //判断是否为文件夹
                else{
                    //如果是文件夹，递归
                    //sonMap里面是子文件夹中每一个文件的个数
                    HashMap<String,Integer> sonmap=countFile(file);
                    //遍历sonmap里面的值
                    Set<Map.Entry<String,Integer>> entries=sonmap.entrySet();
                    for(Map.Entry<String,Integer> e:entries){
                        String key=e.getKey();
                        int value=e.getValue();
                        if(map.containsKey(key)){
                            //存在
                            int count=map.get(key);
                            count=count+value;
                            map.put(key,count);
                        }else{
                            //不存在
                            map.put(key,value);
                        }
                    }
                }
            }

        }
        return map;

    }

}
