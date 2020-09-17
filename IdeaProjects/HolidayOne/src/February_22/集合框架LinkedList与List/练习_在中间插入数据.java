package February_22.集合框架LinkedList与List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//在List的中间位置，插入数据，比较ArrayList快，还是LinkedList快，并解释为什么？
//ArrayList快，插入大量数据的中间需要定位，ArrayList定位快


//在这个位置插入数据
//     数组定位很快，插入数据比较慢
//     链表定位很慢，插入数据比较快
//    最后发现，当总数是10000条的时候，链表定位的总开支要比数组插入的总开支更多，所以最后整体表现，数组会更好。
//   注： 如果数据少，例如总数是1000条，结果可能就不一样了。

public class 练习_在中间插入数据 {
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
            //把当前容器的一半的位置，插入数据
            l.add(l.size()/2,insertNumber);
        }
        long end=System.currentTimeMillis();
        System.out.printf("在%s中间插入100000条数据，耗时%d毫秒\n",string,(end-start));
    }
}
