package io.objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
            反序列化流：可以把序列号到本地文件的对象，读取到程序中来

            构造方法：
                public ObjectInputStream(InputStream out)       把基本流变成高级流

            成员方法：
                public Object readObject()                      把序列化到本地文件中的对象读取到程序中来
         */

        //1.创建反序列化流对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\java\\FileTest\\student1.txt"));

        //2.读取数据
        Object o= ois.readObject();

        //3.打印对象
        System.out.println(o);

        //4.释放资源
        ois.close();

    }
}
