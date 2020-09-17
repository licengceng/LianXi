package February_18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//复制文件是常见的IO操作，设计如下方法，实现复制源文件srcFile到目标文件destFile
//public static void copyFile(String srcFile, String destFile){}
public class 练习_复制文件 {
    public static void copyFile(String srcFile, String destFile){
        File file=new File(srcFile);
        File file2=new File(destFile);

            if (file.exists()&&file2.exists()){
                if (file.isFile()&&file2.isFile()){
                    try(
                            FileInputStream fileInputStream=new FileInputStream(file);
                            FileOutputStream fileOutputStream=new FileOutputStream(file2);

                    ){
                          byte b[]=new byte[(int)file.length()];
                          fileInputStream.read(b);
                          fileOutputStream.write(b);
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("输入的文件路径至少有一个是文件夹！");
                }
            }else {
                System.out.println("文件路径不存在！");
            }

    }
    public static void main(String[] args) {
        String string1="d:/IdeaProjects\\HolidayOne\\src\\pratice/lianxi.java";
        String string2="d:/IdeaProjects\\HolidayOne\\src\\pratice/lianxi.txt";
        copyFile(string1,string2);
    }
}
