package io.integrateTest;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        /*
            利用hutool包进行网络爬虫
         */

        //1.定义网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "https://www.hmz8.com/qiming/qiming7/5856.html";
        String girlNameNet = "https://www.hmz8.com/qiming/qiming8/5858.html";

        //2.爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.利用正则表达式获取数据
        ArrayList<String> familyNameTempList = (ArrayList<String>) ReUtil.findAll( "(.{4})(，|。)",familyNameStr, 1);
        ArrayList<String> boyNameTempList = (ArrayList<String>) ReUtil.findAll("(\\W{2})(、)",boyNameStr,  1);
        ArrayList<String> girlNameTempList = (ArrayList<String>) ReUtil.findAll("([/^[\\u4E00-\\u9FA5]+$/]{2})(、)", girlNameStr, 1);

        //System.out.println(familyNameTempList);
        //System.out.println(boyNameTempList);
        //System.out.println(girlNameTempList);


        //4.处理数据
        ArrayList<String> familyNameList=new ArrayList<>();
        for(String str:familyNameTempList){
            //str   赵钱孙李    周吴郑王
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                familyNameList.add(c+"");
            }
        }
        //System.out.println(familyNameList);

        //boyNameTempList
        //处理方案：去除其中的重复元素
        ArrayList<String> boyNameList=new ArrayList<>();
        for(String s:boyNameTempList){
            if(!boyNameList.contains(s)){
                boyNameList.add(s);
            }
        }


        //girlNameTempList
        //处理方案：去重
        ArrayList<String> girlNameList=new ArrayList<>();
        for(String s:girlNameTempList){
            if(!girlNameList.contains(s)){
                girlNameList.add(s);
            }
        }
        //System.out.println(girlNameList);

        //5.生成数据
        ArrayList<String> list=getInfos(familyNameList,boyNameList,girlNameList,30,20);
        Collections.shuffle(list);
        System.out.println(list);

        //6.写出数据
        FileUtil.writeLines(list,"D:\\java\\FileTest\\name.txt","UTF-8");

    }


    public static ArrayList<String> getInfos(ArrayList<String> familyNameList,ArrayList<String> boyNameList,
                                             ArrayList<String> girlNameList,int boyCount,int girlCount) {

        //1.生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);

            boyhs.add(familyNameList.get(0) + boyNameList.get(0));

        }
        //System.out.println(boyhs);

        //2，生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);

            girlhs.add(familyNameList.get(0) + girlNameList.get(0));

        }
        //System.out.println(girlhs);

        //3. 张三-男-23
        //把男生和女生的姓名添加到list集合中
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);
        }

        for (String girlName : girlhs) {
            int age = r.nextInt(10) + 18;
            list.add(girlName + "-女-" + age);
        }


        return list;
    }
}
