package February_20;

import java.util.ArrayList;

public class 集合框架方法_size获取大小 {
    //size 用于获取ArrayList的大小
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
        System.out.println(heros);
        System.out.println("获取ArrayList的大小：");
        System.out.println(heros.size());
    }
}