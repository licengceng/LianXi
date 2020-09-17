package pratice;

import java.util.Scanner;

public class 字符输入输出 {
    public static void main(String[] args) {
        String message;
        Scanner  scanner=new Scanner(System.in);
        System.out.println("Enter a line of text:");
        message=scanner.nextLine();
        System.out.println("You entered:\""+message+ "\""); //注意：(转义) \" 即为 引号“
    }
}
