package February_12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//骤 1 : 文件不存在异常 顶 折 纠 问
//比如要打开d盘的LOL.exe文件，这个文件是有可能不存在的
//Java中通过 new FileInputStream(f) 试图打开某文件，就有可能抛出文件不存在异常FileNotFoundException
//如果不处理该异常，就会有编译错误

public class 异常 {
//    常见异常：
//    空指针异常、类型转换异常、数组越界异常、系统找不到指定文件异常、
    public static void main(String[] args) {

        File f= new File("d:/LOL.txt");

        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
       try{
           new FileInputStream(f);
       }catch(FileNotFoundException e) {
           e.printStackTrace();
           System.out.println("文件不存在");
        }
    }
}
