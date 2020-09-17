package February_20.泛型Generic;
import February_20.Hero;
import java.util.LinkedList;
// 不支持泛型的Stack
public class HeroStack {
//以Stack栈为例子，如果不使用泛型
//当需要一个只能放Hero的栈的时候，就需要设计一个HeroStack
//当需要一个只能放Item的栈的时候，就需要一个ItemStack
    LinkedList<Hero> heros = new LinkedList<Hero>();
    public void push(Hero h) {
        heros.addLast(h);
    }
    public Hero pull() {
        return heros.removeLast();
    }
    public Hero peek() {
        return heros.getLast();
    }
    public static void main(String[] args) {
        HeroStack heroStack = new HeroStack();
        for (int i = 0; i < 5; i++) {
            Hero h = new Hero("hero name " + i);
            System.out.println("压入 hero:" + h);
            heroStack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("弹出 hero" + h);
        }
    }
}