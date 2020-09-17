package February_20;

import java.util.ArrayList;

public class 集合框架方法_get获取指定位置的对象 {
    //通过get获取指定位置的对象，如果输入的下标越界，一样会报错
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        //获取指定位置的对象
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
        System.out.println(heros.get(6));

    }

}