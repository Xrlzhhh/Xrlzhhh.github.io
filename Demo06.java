package File_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("hello-world.txt");
        byte[] buf = new byte[1024];
        int len;
        int count = 0;
        int length = 0;
        while (true){
            len = inputStream.read(buf);
            if (len==-1){
                break;
            }else {
                length=len;
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.printf("%c",buf[i]);
        }
    }
}
