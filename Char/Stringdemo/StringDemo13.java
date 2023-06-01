package Char.Stringdemo;

//String replace替换

public class StringDemo13 {
    public static void main(String[] args){
        //获取说的话
        String talk="SB,你玩的真好CNM，以后不要再玩了，TMD";

        //定义一个敏感词库
        String[] arr={"TMD","CNM","SB","MLGB"};

        for(int i=0;i<arr.length;i++){
            talk=talk.replace(arr[i],"***");
        }

        //把敏感词TMD替换
        //String result =talk.replace("TMD","***");

        System.out.println(talk);
    }
}
