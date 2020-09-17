package February_15;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

//假设你的项目目录是 e:/project，遍历这个目录下所有的java文件（包括子文件夹），
//找出文件内容包括 Magic的那些文件，并打印出来
public class 查找文件内容 {
    public static void search(File f,String string){
        if (f.isFile()){
            if (f.getName().toLowerCase().endsWith(".java")){
                String fileContent=readFileContent(f);
                if (fileContent.contains(string)){
                    System.out.printf("找到子目标字符串%s,在文件:%s%n",string,f);
                }
            }
        }
        if (f.isDirectory()){
            File fs[]=f.listFiles();
            for (File file:fs) {
                search(file,string);
            }
        }
    }
    public static String readFileContent(File file){
        try (
                FileReader fileReader=new FileReader(file);
                ){
            char all[]=new char[(int)file.length()];
            fileReader.read(all);
            return new String(all);
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        File file=new File("D:\\IdeaProjects\\HolidayOne\\src");
        search(file,"Magic");
    }
}
