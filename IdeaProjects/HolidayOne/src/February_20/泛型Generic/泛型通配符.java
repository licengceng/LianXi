package February_20.泛型Generic;
import February_20.ADHero;
import February_20.APHero;
import February_20.Hero;
import java.util.ArrayList;
//ArrayList heroList<? extends Hero> 表示这是一个Hero泛型或者其子类泛型    ? extends
//heroList 的泛型可能是Hero
//heroList 的泛型可能是APHero
//heroList 的泛型可能是ADHero
//所以 可以确凿的是，从heroList取出来的对象，一定是可以转型成Hero的
//但是，不能往里面放东西，因为
//放APHero就不满足<ADHero>
//放ADHero又不满足<APHero>
public class 泛型通配符 {
    public static void main(String[] args) {
        ArrayList<APHero> apHeroList = new ArrayList<APHero>();
        apHeroList.add(new APHero());

        ArrayList<? extends Hero> heroList = apHeroList;
        //? extends Hero 表示这是一个Hero泛型的子类泛型
        //heroList 的泛型可以是Hero
        //heroList 的泛型可以使APHero
        //heroList 的泛型可以使ADHero
        //可以确凿的是，从heroList取出来的对象，一定是可以转型成Hero的
        Hero h= heroList.get(0);
        //但是，不能往里面放东西
        //heroList.add(new ADHero()); //编译错误，因为heroList的泛型 有可能是APHero

    }
}
