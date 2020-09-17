package pratice;

import java.util.Arrays;

public class lianxi4 {
    public static void main(String[] args) {
//        首先定义一个5X8的二维数组，然后使用随机数填充满。
//        借助Arrays的方法对二维数组进行排序。
//        int a[][]=new int[5][8];
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                a[i][j]=(int)(Math.random()*100);
//
//            }
//        }
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print("["+a[i][j]+"]");
//            }
//            System.out.println("\n");
//        }
//      System.out.println(Arrays.deepToString(a));  //二维数组的字符串转换

//        把一个数组的值，复制到另一个数组中
//
//        System.arraycopy(src, srcPos, dest, destPos, length)
//
//
//        src: 源数组
//        srcPos: 从源数组复制数据的起始位置
//        dest: 目标数组
//        destPos: 复制到目标数组的起始位置
//        length: 复制的长度
        int c[][]=new int[5][8];
        for (int i=0;i<c.length;i++){
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(c));
        int d[]=new int[40];
        for (int i=0;i<c.length;i++){
            System.arraycopy(c[i],0,d,8*i,c[i].length);
        }
        Arrays.sort(d);
        for (int i=0;i<c.length;i++){
            System.arraycopy(d,8*i,c[i],0,c[i].length);
        }
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c[i].length ; j++) {
                System.out.print("["+c[i][j]+"]");
            }
            System.out.println("\n");
        }
        System.out.println(Arrays.deepToString(c));

    }

}
