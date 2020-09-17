package February_27.集合框架比较器Comparator.comparable;
//使Hero类实现Comparable接口
//        在类里面提供比较算法
//        Collections.sort就有足够的信息进行排序了，也无需额外提供比较器Comparator
//        注： 如果返回-1, 就表示当前的更小，否则就是更大
public class Hero implements Comparable<Hero>{
    public String name;
    public float hp;
    public int damage;
    public Hero(){
    }
    public Hero(String name) {
        this.name =name;
    }
    //初始化name,hp,damage的构造方法
    public Hero(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }
    @Override
    public int compareTo(Hero anotherHero) {
        if(damage<anotherHero.damage)
            return 1;
        else
            return -1;
    }
    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
}