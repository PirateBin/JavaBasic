package io.charStream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("b.txt");

        fw.write("天青色等烟雨\r\n");
        fw.write("而我在等你\r\n");
        //刷新，把缓冲区内数据放到内存中
        fw.flush();

        fw.write("月色被打捞起\r\n");
        fw.write("晕开了结局\r\n");

        fw.close();

    }
}
