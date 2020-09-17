package February_24.集合框架HashMap;
import February_10.时间Date;
import February_22.集合框架LinkedList与List.Hero;
import pratice3.Item;

import java.util.HashMap;
//对于HashMap而言，key是唯一的，不可以重复的。
//所以，以相同的key 把不同的value插入到 Map中会导致旧元素被覆盖，只留下最后插入的元素。
//不过，同一个对象可以作为值插入到map中，只要对应的key不一样
public class HashMap的键值对 {
    public static void main(String[] args) {
       HashMap<String,Hero> heroMap=new HashMap<>();
       heroMap.put("gareen",new Hero("gareen"));
        System.out.println(heroMap);
        //key为gareen已经有value了，再以gareen作为key放入数据，会导致原英雄，被覆盖
        //不会增加新的元素到Map中
        heroMap.put("gareen", new Hero("gareen2"));
        System.out.println(heroMap);
        //清空map
        heroMap.clear();
        Hero gareen = new Hero("gareen");
        //put就是放数据,同一个对象可以作为值插入到map中，只要对应的key不一样
        heroMap.put("hero1", new Hero("gareen"));
        heroMap.put("hero2",new Hero("gareen"));
        System.out.println(heroMap);
        //get根据key去取对应的value，如果没有取出来的就是null
        System.out.println(heroMap.get("hero1"));//gareen
    }
}