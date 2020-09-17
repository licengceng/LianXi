package February_20;
import java.util.ArrayList;
//indexOf用于判断一个对象在ArrayList中所处的位置,与contains一样，判断标准是对象是否相同，而非对象的name值是否相等

public class 集合框架方法_indexOf获取对象所处位置 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象(索引-从零开始)
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);

        System.out.println(heros);
        System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));//5
        System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+heros.indexOf(new Hero("hero 1")));//-1
        System.out.println("新的英雄，但是名字是\"hero 2\"所处的位置:"+heros.indexOf(new Hero("hero 2")));//-1


    }
}
