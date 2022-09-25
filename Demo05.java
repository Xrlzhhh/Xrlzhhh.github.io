package File_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo05 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("hello-world.txt");
            while (true){
                int b = is.read();
                if (b==-1){
                    //代编文件已经全部读完
                    break;
                }
                System.out.printf("%c",b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
