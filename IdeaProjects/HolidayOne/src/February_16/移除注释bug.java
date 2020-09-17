package February_16;
import java.io.*;

//设计一个方法，用于移除Java文件中的注释
//public void removeComments(File javaFile)
//比如，移出以//开头的注释行
//File f = new File("d:/LOLFolder/LOL.exe");
//System.out.println("当前文件是：" +f);
////文件是否存在
//System.out.println("判断是否存在："+f.exists());
////是否是文件夹
//System.out.println("判断是否是文件夹："+f.isDirectory());
//注： 如果注释在后面，或者是/**/风格的注释，暂不用处理
public class 移除注释bug {
    public static void removeComments(File javaFile){
        if (javaFile.exists()){   //文件存在
            System.out.println("文件是否存在："+javaFile.exists());
            if (javaFile.isDirectory()){
                System.out.println("该文件是文件夹！");
            }else{
                try(
                        FileReader fileReader=new FileReader(javaFile);
                        BufferedReader bufferedReader=new BufferedReader(fileReader);
                        FileWriter fileWriter=new FileWriter(javaFile);
                        PrintWriter printWriter=new PrintWriter(fileWriter);
                ){
                   while (true){
                       String string= bufferedReader.readLine();

                       if (string.substring(0,3).equals("//")){
                            string=string.substring(3);
                           System.out.println(string);
                       }
                      if(!(string.substring(0,3).equals("//")) ){
                           continue;
                       }
                       printWriter.println(string);
                       if (string==null){
                           break;
                       }

                   }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }else {
            System.out.println("文件不存在！");
            File newfile=javaFile.getParentFile();  //该路径文件不存在，将创建该路径的文件
            newfile.mkdirs();
        }
    }
    public static void main(String[] args) {
        File file=new File("d:/IdeaProjects/HolidayOne/src/test/ADHero.java");
         removeComments(file);
    }
}
