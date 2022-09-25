package File_Demo;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        File dir = new File("D:\\File\\some-dir2");
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
        System.out.println(dir.mkdir());
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
    }
}
