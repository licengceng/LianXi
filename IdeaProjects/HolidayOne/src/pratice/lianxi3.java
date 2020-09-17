package pratice;

public class lianxi3 {
    public static void main(String[] args) {
//        定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
//        找出这个二维数组里，最大的那个值，并打印出其二维坐标
                int a[][]=new int[5][5];
                int x=0;
                int y=0;
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                a[i][j]=(int)(Math.random()*100);
            }
        }
        int max=a[0][0];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print(a[i][j]+"\t");
                if (a[i][j]>max){
                    max=a[i][j];
                    x=i;
                    y=j;
                }
            }
            System.out.println(); //按矩阵形式输出，输出每一行数据
        }
//        int max=a[0][0];
//        for (int h[]:a) {
//            for (int s:h) {
//                if(s>max) max=s;
//            }
//        }
        System.out.println("数组中最大值为："+max);
        System.out.println("坐标为：["+x+"],["+y+"]");
    }
}
