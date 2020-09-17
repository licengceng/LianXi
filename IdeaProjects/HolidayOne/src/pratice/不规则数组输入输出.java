package pratice;

public class 不规则数组输入输出 {
    public static void main(String[] args) {
        int myTable[][]={
                {1,2,3,4,5},
                {6,7,8,9},
                {10,11,12}
        };

        for(int i=0;i<myTable.length;i++){
            for (int j = 0; j<myTable[i].length ; j++) {
                System.out.println(myTable[i][j]+"");
            }
        }

        //二维数组的foreach遍历输出
        int b[][]={
                {9,9,9,9,9},
                {9,9,9,9},
                {9,9,9}
        };
        for (int h[]:b ){
            for (int aa:h){
                System.out.println(aa+"");
            }
        //    System.out.println();
        }

    }
}
