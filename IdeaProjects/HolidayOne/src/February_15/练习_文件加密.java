package February_15;
import java.io.*;

//准备一个文本文件(非二进制)，其中包含ASCII码的字符和中文字符。
//设计一个方法
//public static void encodeFile(File encodingFile, File encodedFile);
//在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
//加密：如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
//如果是9的数字，变成0
//字母字符：
//如果是非z字符，向右移动一个，比如d变成e, G变成H
//如果是z，z->a, Z-A。
//字符需要保留大小写
//非字母字符
//比如',&^ 保留不变，中文也保留不变
//建议： 使用以前学习的练习题中的某个Java文件，比如循环练习，就有很多的字符和数字
public class 练习_文件加密 {
    public static void encodeFile(File file, FileReader encodingFile){
       try {
           char chars[]=new char[(int)file.length()];
           encodingFile.read(chars);
           System.out.println("加密前：");
           for (char a:chars) {
               System.out.print(a);
           }
           System.out.println("\n加密后：");
           for (int i = 0; i <chars.length ; i++) {
               if (0<=chars[i]&&8<=chars[i]){
                   chars[i]=(char) (chars[i]+1);
               }else if ('a'<=chars[i]&&chars[i]<'z'){
                   chars[i]=(char) (chars[i]+1);
               }
               else if ('A'<=chars[i]&&chars[i]<'Z'){
                   chars[i]=(char) (chars[i]+1);
               }else if (chars[i]=='9'){
                    chars[i]='0';
               }else if (chars[i]=='z'){
                   chars[i]='a';
               }else if (chars[i]=='Z'){
                   chars[i]='A';
               }
               else {
                   continue;
               }
           }
           for (char a:chars) {
               System.out.print(a);
           }
           try(FileWriter fileWriter=new FileWriter(file)){   //将修改后的数据写到物理文件中
               fileWriter.write(chars);
           }catch (IOException e){
               e.printStackTrace();
           }

       }catch (IOException e){
           e.printStackTrace();

       }

    }
    public static void main(String[] args) {
        File file=new File("d:/xxx.txt");
        try(FileReader fileReader=new FileReader(file)){
             encodeFile(file, fileReader);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
