package February_24.集合框架HashMap;
import February_22.集合框架LinkedList与List.Hero;
import java.util.ArrayList;
import java.util.HashMap;
//准备一个ArrayList其中存放3000000(三百万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
//hero-3229
//hero-6232
//hero-9365
//因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来
//要求使用两种办法来寻找
//1. 不使用HashMap，直接使用for循环找出来，并统计花费的时间
//2. 借助HashMap，找出结果，并统计花费的时间
public class 练习_查找内容性能比较 {
    public static void main(String[] args) {
        int count=0;
        int count2=0;
        ArrayList<Hero> heroArrayList=new ArrayList<>();
        for (int i = 0; i <3*1000*1000 ; i++) {
            heroArrayList.add(new Hero("hero-"+(int)(1000+Math.random()*9000)));
        }
        long start=System.currentTimeMillis();
        for (int i = 0; i <heroArrayList.size() ; i++) {
            if (heroArrayList.get(i).name.trim().substring(5).equals("5555")){
                count++;
            }
        }
        System.out.println(heroArrayList.size());
        long end=System.currentTimeMillis();
        System.out.printf("hero-5555出现的次数为：%d,不利用HashMap,花费时间为：%d毫秒\n",count,(end-start));
        HashMap<String,String> heroStringHashMap=new HashMap<>();
        String a;
        for (int i = 0; i <3*1000*1000;i++) {
            a=String.valueOf(i);
            heroStringHashMap.put(a,heroArrayList.get(i).name);
        }
        System.out.println(heroStringHashMap.size());
         start=System.currentTimeMillis();
        for (int i = 0; i <heroStringHashMap.size(); i++) {
            a=String.valueOf(i);
            if (heroStringHashMap.get(a).equals("hero-5555")){
                count2++;
            }
        }
         end=System.currentTimeMillis();
        System.out.printf("hero-5555出现的次数为：%d,利用HashMap,花费时间为：%d毫秒",count2,(end-start));
    }
}
