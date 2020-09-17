package February_20.泛型Generic;

import February_20.ADHero;
import February_20.Hero;

import java.util.ArrayList;

//假设容器的泛型是Hero,那么Hero的子类APHero,ADHero都可以放进去
//和Hero无关的类型Item还是放不进去
public class 泛型使用 {
    public static void main(String[] args) {
        ArrayList<Hero> heros = new ArrayList<Hero>();

        //只有作为Hero的子类可以放进去
        heros.add(new ADHero("physical"));

        //和Hero无关的类型Item还是放不进去
        //heros.add(new Item());

    }
}
