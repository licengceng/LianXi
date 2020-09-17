package February_26.集合框架Collectiion.Collections类;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//首先初始化一个List,长度是10，值是0-9。
//        然后不断的shuffle，直到前3位出现
//        3 1 4
//        shuffle 1000,000 次，统计出现的概率
public class 练习_统计概率 {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            integerList.add(i);
        }
        int count=0;
        for (int i = 0; i < 1000*1000; i++) {
            Collections.shuffle(integerList);

            if (integerList.get(0)==3&&integerList.get(1)==1&integerList.get(2)==4){
                count++;
            }
        }
        double rate=(double) count/(1000*1000);
        System.out.println("出现314次数为："+count+",概率为："+rate);
    }
}
