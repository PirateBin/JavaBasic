package io.bufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {

        /*
            字符缓冲输出流：
                构造方法：
                    public BufferedWriter(Writer r)
                特有方法：
                    public void newLine()           跨平台的换行
         */

        BufferedWriter bw=new BufferedWriter(new FileWriter("copy.txt",true));

        //写出数据
        bw.write("如传世的青花瓷自顾自美丽,你眼带笑意");
        bw.newLine();
        bw.write("天青色等烟雨，而我在等你");

        bw.close();

    }
}
