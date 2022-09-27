package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("./src/io/bbb.txt");//相当于打开文件
        while (true){
            int b = inputStream.read();
            if (b==-1){
                break;
            }
            System.out.printf("%c",b);
        }
    }
}
