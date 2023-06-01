package io.charStream;

import java.io.FileWriter;
import java.io.IOException;

public class CharDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("b.txt");

        for(int i=0;i<8192;i++) {
            fw.write('a');
        }

        fw.write('b');

        fw.close();

    }
}
