package pratice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 数组 {

        public static void main(String[] args) {
            int[] a = new int[5];
            a[0] = (int) (Math.random() * 100);
            a[1] = (int) (Math.random() * 100);
            a[2] = (int) (Math.random() * 100);
            a[3] = (int) (Math.random() * 100);
            a[4] = (int) (Math.random() * 100);
            int min=0;
            System.out.println("数组中的各个随机数是:");
            for (int i = 0; i < a.length; i++)
                System.out.println(a[i]);
                System.out.println("-------------------------------------------------------------");


            for (int i = 0; i <a.length-1 ; i++) {  //选择排序法
                for (int j = i+1; j <a.length ; j++) {
                    if (a[i]>=a[j]){           //大数放后面
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }

            }
//            for (int i = 0; i <a.length-1 ; i++) {   //冒泡法
//                for (int j = 0; j <a.length-1-i ; j++) {
//                    if (a[j]>=a[j+1]){   //大数放后面
//                        int temp=a[j+1];
//                        a[j+1]=a[j];
//                        a[j]=temp;
//                    }
//                }
//
//            }
            min=a[0];

//            Arrays.sort(a);
            for (int x:  a) {
                System.out.println(x);
            }
            System.out.println("本练习的目的是，找出最小的一个值: "+min);
        }
    }
