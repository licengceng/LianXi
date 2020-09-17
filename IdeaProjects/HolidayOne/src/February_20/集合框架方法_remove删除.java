package February_20;

import java.util.ArrayList;

//remove用于把对象从ArrayList中删除
public class 集合框架方法_remove删除 {
    //remove可以根据下标删除ArrayList的元素
    //heros.remove(2);
    //也可以根据对象删除
    //heros.remove(specialHero);
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);//[hero 0, hero 1, hero 2, hero 3, hero 4, special hero]
        heros.remove(2);
        System.out.println("删除下标是2的对象");
        System.out.println(heros);//[hero 0, hero 1, hero 3, hero 4, special hero]
        System.out.println("删除special hero");
        heros.remove(specialHero);
        System.out.println(heros);//[hero 0, hero 1, hero 3, hero 4]

    }
}