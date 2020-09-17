package February_20;

public class APHero extends Hero {
    int hp=66;
    int ap=50;
    public APHero(){}
    public APHero(String name){
        super(name);
        System.out.println("再调用子类构造方法");
    }

    public static void main(String[] args) {
        APHero adHero=new APHero("曹操"); //先调用父类构造方法 再调用子类构造方法

    }
}
