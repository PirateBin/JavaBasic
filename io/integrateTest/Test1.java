package io.integrateTest;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
            制造假数据：
                获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
                获取男生名字：https://www.hmz8.com/qiming/qiming7/5856.html
                获取女生名字：https://www.hmz8.com/qiming/qiming8/5858.html


         */

        //1.定义变量记录网址
        String familyNameNet="https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet="https://www.hmz8.com/qiming/qiming7/5856.html";
        String girlNameNet="https://www.hmz8.com/qiming/qiming8/5858.html";

        //2.爬取数据
        //定义一个方法用来爬取数据
        String familyNameStr=webCrawler(familyNameNet);
        String boyNameStr=webCrawler(boyNameNet);
        String girlNameStr=webCrawler(girlNameNet);

        //System.out.println(familyNameStr);

        //3.通过正则表达式，把其中获取要求的数据获取出来
        ArrayList<String> familyNameTempList=getData(familyNameStr,"(.{4})(，|。)",1);
        ArrayList<String> boyNameTempList=getData(boyNameStr,"(\\W{2})(、)",1);
        //   /^[\u4E00-\u9FA5]+$/  中文 /^[\u4E00-\u9FA5]+$/
        ArrayList<String> girlNameTempList=getData(girlNameStr,"([/^[\\u4E00-\\u9FA5]+$/]{2})(、)",1);

        //System.out.println(familyNameTempList);
        //System.out.println(boyNameTempList);
        //System.out.println(girlNameTempList);

        //4.处理数据
        //familyNameTempList
        ArrayList<String> familyNameList=new ArrayList<>();
        for(String str:familyNameTempList){
            //str   赵钱孙李    周吴郑王
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                familyNameList.add(c+"");
            }
        }
        System.out.println(familyNameList);

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
        System.out.println(girlNameList);


        //5.生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> list=getInfos(familyNameList,boyNameList,girlNameList,10,10);
        Collections.shuffle(list);
        System.out.println(list);


        //6.写出数据
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("D:\\java\\FileTest\\name.txt")));
        for(String s:list){
            bw.write(s);
            bw.newLine();
        }

        bw.close();

    }

    //根据正则表达式获取字符串中的数据
    private static ArrayList<String> getData(String Str,String regex,int index) {
        //1.创建集合存放数据
        ArrayList<String> list=new ArrayList<>();
        //2.按照正则表达式的规则去获取数据
        Pattern pattern= Pattern.compile(regex);
        //按照Pattern的规则去str中获取数据
        Matcher matcher= pattern.matcher(Str);
        while(matcher.find()){
            list.add(matcher.group(index));
            //String group=matcher.group(index);
            //System.out.println(group);
        }

        return list;

    }

    //从网络中爬取数据，并把数据拼接成字符串返回
    public static String webCrawler(String net) throws IOException {
        StringBuilder sb=new StringBuilder();
        //创建一个url对象
        URL url=new URL(net);
        //链接上这个网址
        URLConnection conn=url.openConnection();
        //读取数据
        //将字节输入流转换成字符流
        InputStreamReader isr=new InputStreamReader(conn.getInputStream());
        int ch;
        while((ch=isr.read())!=-1){
            sb.append((char)ch);
        }
        isr.close();

        //把读取到是数据进行返回
        return sb.toString();
    }


    //获取男生和女生的信息

    /*
        参数一：装着形姓氏的集合
        参数二：装着男生名字的集合
        参数三：装着女生名字的集合
        参数四：男生的个数
        参数五：女生的个数
     */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList,ArrayList<String> boyNameList,
                                             ArrayList<String> girlNameList,int boyCount,int girlCount){

        //1.生成男生不重复的名字
        HashSet<String> boyhs=new HashSet<>();
        while(true){
            if(boyhs.size()==boyCount){
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);

            boyhs.add(familyNameList.get(0)+boyNameList.get(0));

        }
        //System.out.println(boyhs);

        //2，生成女生不重复的名字
        HashSet<String> girlhs=new HashSet<>();
        while(true){
            if(girlhs.size()==girlCount){
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);

            girlhs.add(familyNameList.get(0)+girlNameList.get(0));

        }
        //System.out.println(girlhs);

        //3. 张三-男-23
        //把男生和女生的姓名添加到list集合中
        ArrayList<String> list=new ArrayList<>();
        Random r=new Random();
        for(String boyName:boyhs){
            int age=r.nextInt(10)+18;
            list.add(boyName+"-男-"+age);
        }

        for(String girlName:girlhs){
            int age=r.nextInt(10)+18;
            list.add(girlName+"-女-"+age);
        }


        return list;


    }

}
