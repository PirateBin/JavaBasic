package Char.Stringdemo;

//String replace替换

public class StringDemo12 {
    public static void main(String[] args){
        //获取说的话
        String talk="你玩的真玩，以后不要再玩了，TMD";

        //把敏感词TMD替换
        String result =talk.replace("TMD","***");

        System.out.println(result);
    }
}
