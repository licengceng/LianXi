package February_22.集合框架LinkedList与List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//比较 ArrayList和LinkedList 在最后面插入100000条数据，谁快谁慢？为什么？
//由程序结果知，LinkedList快，不需要定位，直接在最后面添加数据即可 （在最前面插入也是ArrayList快）

//直接调用add方法，就表示在最后插入数据
//因为是插入在最后面，所以对于数组而言，并没有一个移动很多数据的需要，所以也非常的快
//而链表本身就很快，无论插入在哪里
public class 练习_在后面插入数据 {
    public static void main(String[] args) {
        List<Integer> list;
        list=new ArrayList<>();
       insert(list,"ArrayList");
        list=new LinkedList<>();
        insert(list,"LinkedList");
    }
    private   static void insert(List l,String string){
        int insertNumber=6;
        long start=System.currentTimeMillis();
        for (int i = 0; i <100*1000 ; i++) {
            l.add(insertNumber);
        }
        long end=System.currentTimeMillis();
        System.out.printf("在%s最后面插入100000条数据，耗时%d毫秒\n",string,(end-start));
    }
}
