package February_25.集合框架HashSet;
import java.util.HashSet;
import java.util.Iterator;
//Set不提供get()来获取指定位置的元素
//    所以遍历需要用到迭代器，或者增强型for循环
public class 遍历 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        //Set不提供get方法来获取指定位置的元素
        //numbers.get(0)
        //遍历Set可以采用迭代器iterator
        for ( Iterator<Integer> integerIterator=numbers.iterator();integerIterator.hasNext();) {
           int i =  integerIterator.next();
            System.out.println(i);
        }
        //或者采用增强型for循环
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}