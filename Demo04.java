package File_Demo;

import java.io.File;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        File file = new File("some-file.txt");
        File dest = new File("dest.txt");
        file.createNewFile();
        file.renameTo(dest);
    }
}
