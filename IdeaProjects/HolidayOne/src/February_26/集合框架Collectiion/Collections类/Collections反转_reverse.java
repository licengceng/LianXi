package February_26.集合框架Collectiion.Collections类;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Collections是一个类，容器的工具类,就如同Arrays是数组的工具类
public class Collections反转_reverse {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println("翻转后集合中的数据:");
        System.out.println(numbers);
    }
}