package File_Demo;

import java.io.File;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\some-file.txt");
        System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        file.deleteOnExit();
    }
}
