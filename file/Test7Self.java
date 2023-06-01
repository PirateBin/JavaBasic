package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test7Self {
    public static void main(String[] args) {

                /*
            统计一个文件夹中每种文件的个数并打印（考虑子文件）

            File 递归 Map集合(键：文本文件 ，值：次数)
         */

        File f=new File("D:\\java\\FileTest");
        HashMap<String,Integer> map=getCount(f);
        System.out.println(map);


    }

    public static HashMap<String,Integer> getCount(File src){
        //创建一个map用来统计文件出现的次数
        HashMap<String,Integer> map=new HashMap<>();
        //定义一个count作为map的value

        //获取文件夹里的数据
        File[] files=src.listFiles();

        //如果files不为null，开始遍历数组
        if(files!=null){

            for(File file:files){
                //判断是否为文件夹
                //如果是文件
                if(file.isFile()){
                    //先获取文件名后缀
                    String[] name=file.getName().split("\\.");

                    //判断数组的长度
                    //数组长度大于等于2才能获取后缀名
                    if(name.length>=2) {
                        //a.a.txt
                        String endName = name[name.length - 1];
                        //判断map中是否有endName
                        if(map.containsKey(endName)){
                            //如果含有,map中value值加1
                            //获取key对应的value值
                            int count=map.get(endName);
                            count++;
                            map.put(endName,count);
                        }else{
                            //如果map中不含有endName，将endName添加进map
                            map.put(endName,1);
                        }

                    }


                }else{

                    //如果不是文件，递归文件夹
                    //递归文件夹中会创建新的HashMap,我们需要统计新的HashMap中的value值并添加进已经存在的HashMap值
                    HashMap<String,Integer> sonMap=getCount(file);

                    //获取sonMap中的key和value（即文件后缀名和字数）
                    Set<Map.Entry<String,Integer>> entries=sonMap.entrySet();
                    for(Map.Entry<String,Integer> e:entries){
                        //获取文件名
                        String key=e.getKey();
                        //获取次数
                        int value=e.getValue();

                        //判断原先的HashMap是否存在相同的key，如果存在，相加，如果不存在，创建
                        if(map.containsKey(key)){
                            int count=map.get(key);
                            count=count+value;
                            map.put(key,count);
                        }else{
                            map.put(key,value);
                        }

                    }

                }

            }


        }
        return map;

    }
}
