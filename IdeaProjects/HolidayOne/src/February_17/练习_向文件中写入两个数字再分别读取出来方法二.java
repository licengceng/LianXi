package February_17;

import java.io.*;

//使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。
//注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，
// 读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题
public class 练习_向文件中写入两个数字再分别读取出来方法二 {
    public static void main(String[] args) {
        write();
        read();
    }
    public static void write(){
        File file=new File("d:/lol4.txt");
        try(
                FileWriter fileWriter=new FileWriter(file);
                PrintWriter printWriter=new PrintWriter(fileWriter);
                ) {
            printWriter.println("88@88");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void read(){
        File file=new File("d:/lol4.txt");
        try(
                FileReader fileReader=new FileReader(file);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                ){
            while (true){
                String string=bufferedReader.readLine();
                if (string==null) break;
                String str[]=string.split("@");
                for (String x:str) {
                    System.out.println(x);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
