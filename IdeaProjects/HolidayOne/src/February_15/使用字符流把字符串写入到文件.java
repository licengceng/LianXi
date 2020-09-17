package February_15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
public class 使用字符流把字符串写入到文件 {
    public static void main(String[] args) {
        // 准备文件lol2.txt
        File f = new File("d:/lol2.txt");
        // 创建基于文件的Writer
        try (FileWriter fr = new FileWriter(f)) {
            // 以字符流的形式把数据写入到文件中
            String data="abcdefg1234567890";
          char cs[]=data.toCharArray();  //字符串转换为字符数组
//          String s=String.valueOf(cs);
//            System.out.println(s);
            fr.write(cs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}