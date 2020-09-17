package February_12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//有的时候一段代码会抛出多种异常，比如
//
//new FileInputStream(f);
//Date d = sdf.parse("2016-06-03");
//
//
//这段代码，会抛出 文件不存在异常 FileNotFoundException 和 解析异常ParseException
//解决办法之一是分别进行catch
//
//catch (FileNotFoundException e) {
//    System.out.println("d:/LOL.exe不存在");
//    e.printStackTrace();
//} catch (ParseException e) {
//    System.out.println("日期格式解析错误");
//    e.printStackTrace();
//}
public class 多异常捕捉方法 {

    public static void main(String[] args) {

   File file=new File("d:lol.txt");
   try{
       SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
       Date date= simpleDateFormat.parse("2020-02-12");
       System.out.println("成功将字符串转换成日期："+date);
       System.out.println("试图打开lol.txt文件:");
       new FileInputStream(file);
       System.out.println("lol.txt文件成功打开");

   }catch (FileNotFoundException e){
        e.printStackTrace();
       System.out.println("找不到lol.txt文件");
   }catch (ParseException e){
        e.printStackTrace();
       System.out.println("未成功将字符串转换成日期：");
   }
    }
}