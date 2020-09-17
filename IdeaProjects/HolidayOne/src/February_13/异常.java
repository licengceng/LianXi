package February_13;

import java.io.File;
import java.io.FileInputStream;
//Throwable是类，Exception和Error都继承了该类
//所以在捕捉的时候，也可以使用Throwable进行捕捉
public class 异常  {
    //在方法声明上，可以抛出指定的异常，比如FileNotFoundException
    //那么能否抛出Throwable这个类？
    //这个方法的调用者又该如何处理？
    public static void main(String[] args) throws Throwable {
        File f = new File("d:/LOL.exe");
        try {
            new FileInputStream(f);
            //使用Throwable进行异常捕捉
        } catch (Throwable t) {
            // TODO Auto-generated catch block
            t.printStackTrace();
        }
    }
}
