package io.input;

public class ByteStreamDemo2 {
    public static void main(String[] args) {

        /*
            字节输入流的细节：
                1.创建字节输入对象
                    细节1：如果文件不存在，直接报错
                          输出流：不存在，创建

                          输入流：不存在，报错
                          因为创建出来的文件是没有数据的，没有意义
                          所以Java就不会设计这种没意义的逻辑，直接报错

                2.读取细节
                    一次读一个字节，读出来的数据是ASCII上对应的数字
                    如果督导文件末尾，read方法返回-1

                3.释放资源
         */
    }
}
