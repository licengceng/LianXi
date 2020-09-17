package February_18;

import java.util.Scanner;

public class Scanner读取字符串 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int b = s.nextInt();
        System.out.println("第一个整数："+a);
        System.out.println("第二个整数："+b);
    }
}