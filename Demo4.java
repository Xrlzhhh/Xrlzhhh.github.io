package io;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        File file = new File("./testDir/aaa/bbb");
        file.mkdirs();
    }
}
