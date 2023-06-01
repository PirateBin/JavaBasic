package io.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {

        /*
            换行写：
                    再次写出一个换行符
                    windows: \r\n  回车换行
                    Linux:   \n
                    Mac:     \r
            细节：
                再windows操作系统当中，java对回车换行进行了优化
                虽然是完整的\r\n，但是我们只写其中一个Java底层会补全

            续写：

         */

        //第一个参数表示文件
        //第二个参数表示是否打开续写的开关
        FileOutputStream fos=new FileOutputStream("a.txt",true);

        String str1="kankelaoyezuishuai";
        byte[] bytes1=str1.getBytes();
        fos.write(bytes1);

        //中间写一个换行
        String wrap="\r\n";
        byte[] bytes2=wrap.getBytes();
        fos.write(bytes2);

        String str2="666";
        byte[] bytes3=str2.getBytes();
        fos.write(bytes3);

        fos.close();

    }
}
