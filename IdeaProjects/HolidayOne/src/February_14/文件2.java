package February_14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class 文件2 {
    public static void main(String[] args) throws IOException {

        File f = new File("d:/LOLFolder/LOL.exe");

        File f1 = new File("d:/LOLFolder/LOL.txt");
        System.out.println(f1.exists());
        if (!f1.exists()){
            f1.createNewFile();//如果不存在则创建该文件
        }
        System.out.println(f1.exists());


        System.out.println("当前文件是：" +f);
        //文件是否存在
        System.out.println("判断是否存在："+f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());

        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f.isFile());

        //文件长度
        System.out.println("获取文件的长度："+f1.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        f.setLastModified(0);

        //文件重命名
        File f2 =new File("d:/LOLFolder/DOTA.exe");
        f.renameTo(f2);
        System.out.println("把LOL.exe改名成了DOTA.exe");

        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");
    }
}
