package pratice;

import java.util.Scanner;

public class LX3 {
      float tall;
    int weight;
    public static void main(String[] args) {
        LX3 lx3=new LX3();
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("输入身高为:");
        lx3.tall=scanner1.nextFloat();
        System.out.println("输入体重为:");
        lx3.weight=scanner2.nextInt();
        System.out.println("BIMI为："+(lx3.weight/(lx3.tall*lx3.tall)));
    }

}
