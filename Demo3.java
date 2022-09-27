package io;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        File f = new File("./test.txt");
        f.delete();
    }
}
