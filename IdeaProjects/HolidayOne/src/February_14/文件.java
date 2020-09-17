package February_14;

import java.io.File;
//创建这个file后，只是封装了这个路径，与磁盘路径是否有这个文件无关
//文件和文件夹都是用File代表  使用绝对路径或者相对路径创建File对象
public class 文件 {
    public static void main(String[] args) {
        // 绝对路径
        File f1 = new File("d:/LOLFolder");
        System.out.println("f1的绝对路径：" + f1.getAbsolutePath());
        System.out.println(f1.exists()); //判断物理文件是否真实存在
        // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());
        System.out.println(f2.exists());
        // 把f1作为父目录创建文件对象
        File f3 = new File(f1, "LOL.exe");

        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
        System.out.println(f3.exists());
    }
}
