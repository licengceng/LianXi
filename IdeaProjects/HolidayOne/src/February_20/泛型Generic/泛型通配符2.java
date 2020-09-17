package February_20.泛型Generic;
import February_20.ADHero;
import February_20.APHero;
import February_20.Hero;
import java.util.ArrayList;
//   ? super
//ArrayList heroList<? super Hero> 表示这是一个Hero泛型或者其父类泛型
//heroList的泛型可能是Hero
//heroList的泛型可能是Object
//可以往里面插入Hero以及Hero的子类
//但是取出来有风险，因为不确定取出来是Hero还是Object
public class 泛型通配符2 {
    public static void main(String[] args) {
        ArrayList<? super Hero> heroList = new ArrayList<Object>();
        //? super Hero 表示 heroList的泛型是Hero或者其父类泛型

        //heroList 的泛型可以是Hero
        //heroList 的泛型可以是Object
        //所以就可以插入Hero
        heroList.add(new Hero());
        //也可以插入Hero的子类
        heroList.add(new APHero());
        heroList.add(new ADHero());

        //但是，不能从里面取数据出来,因为其泛型可能是Object,而Object是强转Hero会失败
      //  Hero h= heroList.get(0);

    }

}