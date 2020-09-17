package February_20.泛型Generic;
import February_20.ADHero;
import java.util.ArrayList;
//使用泛型的好处：
//泛型的用法是在容器后面添加<Type>
//Type可以是类，抽象类，接口
//泛型表示这种容器，只能存放APHero，ADHero就放不进去了。
            // 泛型的简写
            //为了不使编译器出现警告，需要前后都使用泛型，像这样：
            //List<Hero> genericheros = new ArrayList<Hero>();
            //不过JDK7提供了一个可以略微减少代码量的泛型简写方式
            //List<Hero> genericheros2 = new ArrayList<>();
public class 使用泛型 {
    public static void main(String[] args) {
        ArrayList<ADHero> heros = new ArrayList<ADHero>();

        //只有ADHero可以放进去
        heros.add(new ADHero("physical"));

        //APHero甚至放不进去
       // heros.add(new APHero());

        //获取的时候也不需要进行转型，因为取出来一定是ADHero
        ADHero apHero =  heros.get(0);

    }
}