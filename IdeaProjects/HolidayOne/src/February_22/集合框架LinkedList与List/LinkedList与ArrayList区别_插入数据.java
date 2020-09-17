package February_22.集合框架LinkedList与List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//*ArrayList与LinkedList区别*
//ArrayList 插入，删除数据慢
//LinkedList， 插入，删除数据快
//ArrayList是顺序结构，所以定位很快，指哪找哪。 就像电影院位置一样，有了电影票，一下就找到位置了。
//LinkedList 是链表结构，就像手里的一串佛珠，要找出第99个佛珠，必须得一个一个的数过去，所以定位慢
public class LinkedList与ArrayList区别_插入数据 {
    public static void main(String[] args) {

        List<Integer> list;
        list = new ArrayList<>();
        insertFirst(list, "ArrayList");

        list = new LinkedList<>();
        insertFirst(list, "LinkedList");

    }
    private static void insertFirst(List<Integer> l, String type) {

        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }
}