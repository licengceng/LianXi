package February_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//在方法声明上，可以抛出指定的异常，比如FileNotFoundException
//那么能否抛出Throwable这个类？
//这个方法的调用者又该如何处理？
public class 异常2 {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
       try {
           method2();
       }catch (Throwable e){
           e.printStackTrace();
           System.out.println("文件打开失败");
       }
    }
    public static void method2() throws Throwable{
        File file=new File("e:lol.txt");
        System.out.println("试图打开文件：");
        new FileInputStream(file);
        System.out.println("文件打开成功");
    }

}
