package pratice;

public class 数组2 {

        public static void main(String[] args) {
            int[] a = new int[5]; //分配了长度是5的数组，但是没有赋值

            //没有赋值，那么就会使用默认值
            //作为int类型的数组，默认值是0
            System.out.println(a[0]);

            //进行赋值

            a[0] = 100;
            a[1] = 101;
            a[2] = 103;
            a[3] = 120;
            a[4] = 140;
            System.out.println("反转前：");
            for (int i = 0; i <a.length ; i++) {
                System.out.println(""+a[i]);
            }
            System.out.println("反转后：");
            for (int i = a.length-1; i >=0 ; i--) {
                System.out.println(""+a[i]);
            }
        //选择法排序
            for (int j = 0; j < a.length-1; j++) {
                for (int i = j+1; i < a.length; i++) {
                    if(a[i]<a[j]){
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }

            //把内容打印出来
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println(" ");
        }
    }

