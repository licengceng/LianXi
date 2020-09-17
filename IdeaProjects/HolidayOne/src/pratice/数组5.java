package pratice;

import java.util.Arrays;

public class 数组5 {
    public static void main(String[] args) {
//        查询元素出现的位置
//        需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
//        如果数组中有多个相同的元素，查找结果是不确定的

                int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
                int b[] = new int[] { 18, 62, 68, 82, 9, 65 };
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));
                //使用binarySearch之前，必须先使用sort进行排序
                System.out.println("数字 62出现的位置:"+ Arrays.binarySearch(a, 62));

//        比较两个数组的内容是否一样
//        第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false
        System.out.println("数组一样的结果为"+Arrays.equals(a,b));

        //数组填充
        int c[]=new int[7];
        int d[]=new int[3];
        Arrays.fill(c,10);
        for (int h:c){
            System.out.print(" "+h);
        }
//        System.arraycopy，需要事先准备好目标数组，并分配长度。 copyOfRange 只需要源数组就就可以了，通过返回值，就能够得到目标数组了
//        除此之外，需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的。
        d=Arrays.copyOfRange(a,0,3);
        for (int i = 0; i <d.length ; i++) {
            System.out.print("["+d[i]+"]");
        }
    }
  }


