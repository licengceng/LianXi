package February_20;

public class ADHero extends Hero {
    int hp=66;
    int sp=50;
    public ADHero(){}
    public ADHero(String name){
        super(name);
        System.out.println("再调用子类构造方法");
    }

    public static void main(String[] args) {
        ADHero adHero=new ADHero("曹操"); //先调用父类构造方法 再调用子类构造方法
        int s=adHero.getHp();
        System.out.println(s);
    }
}
