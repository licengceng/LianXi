package pratice;
//        水仙花数定义：
//        1. 一定是3位数
//        2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
//
//        寻找所有的水仙花数
public class 水仙花 {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            if (i== ((i/100)*(i/100)*(i/100)+(i%10)*(i%10)*(i%10)+(i%100/10)*(i%100/10)*(i%100/10)))
                System.out.println(" 该水仙花数为："+i);
        }
    }
}
