package pratice;

import java.util.Scanner;

public class 阶乘 {
    public static void main(String[] args) {
        System.out.println("输入一个数，打印其阶乘：");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int sum=1;
        while (a>0){
            sum=sum*a;
            a--;
        }
        System.out.println("阶乘为："+sum);
    }
}
