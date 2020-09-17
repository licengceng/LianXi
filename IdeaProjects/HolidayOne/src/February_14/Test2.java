package February_14;

import java.io.File;
import java.nio.file.Files;

//遍历子文件夹
public class Test2 {
    static long maxSize=0;
    static long minSize=Integer.MAX_VALUE;
    static   File maxFile=null;
    static File minFile=null;
    public static void main(String[] args) {
        File file=new File("c:/windows");
        System.out.println(file.exists());
       listFiles(file);
        System.out.println("最大文件是："+maxFile.getAbsolutePath()+"长度为："+maxFile.length());
        System.out.println("最小文件是："+minFile.getAbsolutePath()+"长度为："+minFile.length());

    }
    public static void listFiles(File file){

                if (file.isFile()){
                    if (file.length()>maxSize){
                        maxSize=file.length();
                        maxFile=file;
                    }
                    if (file.length()<maxSize){
                        minSize=file.length();
                        minFile=file;
                    }
                }
                if (file.isDirectory()){
                    File files[]=file.listFiles();
                    if(files!=null)
                    for (File f:files) {
                        listFiles(f);
                    }
                }


        return ;
    }

}
