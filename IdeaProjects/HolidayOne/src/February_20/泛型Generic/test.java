package February_20.泛型Generic;
import February_20.ADHero;
import February_20.APHero;
import February_20.Hero;
import java.util.ArrayList;
public class test {
    public static void iterate(ArrayList<?extends Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }

    //如代码所示，为了遍历不同泛型的3种集合，需要设计3个方法
    //借助? extends， 把代码减肥到只是用一种方法
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();
//        hs.add(new Hero("父类英雄"));
//        aphs.add(new APHero("APH英雄"));
//        adhs.add(new ADHero("ADH英雄"));
        iterate(hs);
        iterate(aphs);
        iterate(adhs);
    }
}