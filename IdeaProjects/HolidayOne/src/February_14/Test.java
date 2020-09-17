package February_14;

import java.io.File;
import java.io.IOException;

//一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
//遍历这个目录下所有的文件(不用遍历子目录)
//找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
public class Test {
    public static void main(String[] args) throws IOException {
//        File file=new File("C:/WINDOWS");
        File file=new File("D:/");
        long maxSize=0;
        long   minSize=Integer.MAX_VALUE;
        File maxfile=null;
        File minfile=null;
        File files[]=file.listFiles();
        System.out.println(file.getParent());
        System.out.println(file.exists());
        for (File e:files) {
            System.out.println(e);
        }
        for (int i = 0; i <files.length ; i++) {
            if(files[i].isDirectory())
                continue;
            if(files[i].length()>maxSize){
                maxfile=files[i];
                maxSize=files[i].length();
            }
            if(files[i].length()!=0&&files[i].length()<minSize){
                minfile=files[i];
                minSize=files[i].length();
            }
        }
        System.out.println("最大文件是："+maxfile.getAbsolutePath()+"长度为："+maxfile.length());
        System.out.println("最小文件是："+minfile.getAbsolutePath()+"长度为："+minfile.length());
    }
}
