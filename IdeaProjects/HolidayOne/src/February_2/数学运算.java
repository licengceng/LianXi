package February_2;

public class 数学运算 {
    public static void main(String[] args) {
//        double n = Integer.MAX_VALUE;
//        double a = 1+1/n;
//        double e = Math.pow(a,n);
//        System.out.println(Math.E);
//        System.out.println(e);

        //统计找出一千万以内，一共有多少质数
        //质数概念: 只能被1和自己整除的数
        //举例:
        //5只能被 1和5整除，所以是质数
        //8可以被2整除，所以不是质数
        int count=0;
        for (int i = 0; i <100 ; i++) {
            if (i%2==0||i%3==0||i%5==0||i%7==0||i%11==0||i%13==0||i%17==0||i%19==0){
                continue;
            }

            count ++;
            System.out.print(i+" ");
            System.out.println(count+"次");
        }

    }
}
