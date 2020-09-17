package pratice;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        int i;
        int sum=1;
        System.out.println("打印i的阶乘,请输入i:");
        Scanner scanner=new Scanner(System.in);
        i=scanner.nextInt();

        while (i>0){
          sum=sum*i;
          i--;
        }
        System.out.println("i的阶乘为："+sum);

       char s[]=new char[]{1,2,3};
        System.out.println(new String(s) );

    }
}
