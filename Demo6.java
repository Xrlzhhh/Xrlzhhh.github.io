package io;

import java.io.File;
import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        File file = new File("./testDir");
        String [] results = file.list();
        System.out.println(Arrays.toString(results));
    }
}
