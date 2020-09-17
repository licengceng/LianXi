package February_21;

import February_20.Hero;

import java.util.ArrayList;
import java.util.List;

public class 集合框架遍历_用for循环遍历 {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();
        // 放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }
        // 第一种遍历 for循环
        System.out.println("--------for 循环-------");
        for (int i = 0; i < heros.size(); i++) {
            Hero h = heros.get(i);
            System.out.println(h);
        }
    }
}