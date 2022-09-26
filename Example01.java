import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Example01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\File\\src\\File_Demo");
        //创建文件过滤器对象
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir,name);
                if (currFile.isFile() && name.endsWith(".txt")){
                    return true;
                }else {
                    return false;
                }
            }
        };
        if (file.exists()){
            String[] names = file.list(filter);
            for(String s : names){
                System.out.println(s);
            }
        }
    }
}
