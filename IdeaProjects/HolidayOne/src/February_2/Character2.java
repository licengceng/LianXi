package February_2;
import java.util.Scanner;
//编译型语言在程序执行之前，有一个单独的编译过程，将程序翻译成机器语言，以后执行这个程序的时候，就不用再进行翻译了
//解释型语言，是在运行的时候将程序翻译成机器语言，所以运行速度相对于编译型语言要慢
//C/C++ 等都是编译型语言，而Java，C#，Javascript 等都是解释型语言。
//但是Java明明有一个从.java文件编译成.class文件的过程，为什么不是编译语言，而是解释语言呢？ 因为.class文件，并不是机器语言，
//而是一个平台无关的"中间语言“ 需要再在虚拟机中再执行
public class Character2 {
    //通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
    //参考的转换方式:
    //
    //String str = "abc123";
    //char[] cs = str.toCharArray();
    public static void main(String[] args) {
        String s="jjx";
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();

        System.out.println(s.toUpperCase());
        char a[]=string.toUpperCase().toCharArray();//通过Scanner从控制台读取字符串转换为全部大写，然后把字符串转换为字符数组
        System.out.println(a) ;
    }
}
