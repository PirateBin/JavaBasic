package io.charStream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //1.创建对象
        FileReader fr = new FileReader("copy.txt");

        //2.读取数据
        //字符流会在内存开辟一块缓冲区，长度为8192字节的数组
        char[] arr = new char[2];
        int len;
        //read(arr)：读取数据，解码，强转三步合并，把强转之后的字符放到数组中
        while ((len = fr.read(arr)) != -1) {
            //把数组中的数据变成字符串
            System.out.print(new String(arr,0,len));
        }

        //3.释放资源
        fr.close();

    }
}
