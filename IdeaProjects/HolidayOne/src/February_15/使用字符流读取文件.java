package February_15;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//Reader字符输入流
//Writer字符输出流

//FileWriter 是Writer的子类，
//FileReader 是Reader子类，以FileReader 为例进行文件读取
public class 使用字符流读取文件 {
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是AB
        File f = new File("d:/lol.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}