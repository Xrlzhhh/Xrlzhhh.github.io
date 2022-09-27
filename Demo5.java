package io;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        //重命名
        File srcFile = new File("./aaa.txt");
        File destFile = new File("bbb.txt");
        srcFile.renameTo(destFile);
    }
}
