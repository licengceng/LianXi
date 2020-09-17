package pratice;

public class Hero {

    String name; //姓名

    float hp; //血量
    static int hh=5;
    static String s="不变的";
    float armor; //护甲

    int moveSpeed; //移动速度
    public Hero(){}

    //带一个参数的构造方法
    public Hero(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    //带两个参数的构造方法
    public Hero(String name,float hp){
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    public static void main(String[] args) {
        Hero teemo =  new Hero("提莫",383);
        teemo.hh=2;teemo.s="变了";
        System.out.println(Hero.hh+" "+Hero.s);
        System.out.println(teemo.hh+" "+teemo.s);
        System.out.println(teemo.name);

    }

}