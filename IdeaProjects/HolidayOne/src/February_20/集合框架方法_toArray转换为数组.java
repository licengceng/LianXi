package February_20;

import java.util.ArrayList;

public class 集合框架方法_toArray转换为数组 {
    //toArray可以把一个ArrayList对象转换为数组。
    //需要注意的是，如果要转换为一个Hero数组，那么需要传递一个Hero数组类型的对象给toArray()，
    // 这样toArray方法才知道，你希望转换为哪种类型的数组，否则只能转换为Object数组
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
        System.out.println(heros);
        Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
        System.out.println("数组:" +hs);
    }
}
