package pratice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class 数组4 {
    public static void main(String[] args) {
        System.out.println(new Date());
        int a[]=new int[8];
        System.out.println("请输入数组个数：");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i = 0; i <num ; i++) {
            a[i]=scanner.nextInt();
        }
        System.out.println("数组元素有：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print("\t"+a[i]);
        }
        System.out.println("\n");
        Arrays.sort(a);   //将数组a排序
        String string= Arrays.toString(a); //转换成字符串
        System.out.println(string);
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("5的位置在："+Arrays.binarySearch(a,5));
    }
}
