package File_Demo;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\hello-world.txt");//并不要求该文件真实存在
        System.out.println(file.getParent());//返回file对象的父目录文件路径
        System.out.println(file.getName());//返回纯文件名称
        System.out.println(file.getPath());//文件路径
        System.out.println(file.getAbsolutePath());//绝对路径
        System.out.println(file.getCanonicalPath());//修饰过的绝对路径
        System.out.println("----------------------------------------");
        System.out.println(file.exists());//判断是否真实存在
        System.out.println(file.isDirectory());//是否是一个文件夹
        System.out.println(file.isFile());//是否是一个文件
        System.out.println(file.createNewFile());//创建空文件 成功后返回true
        System.out.println(file.exists());//是否存在
        System.out.println(file.isDirectory());//是否是一个文件夹
        System.out.println(file.isFile());//是否是文件
        System.out.println(file.createNewFile());//创建空文件 成功后返回true
    }
}
