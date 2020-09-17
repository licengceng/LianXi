package pratice;
 class Item {
    String name;
    int price;
}
//设计一个类Armor护甲
//        继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
//
//        实例化出两件护甲
//        名称 价格 护甲等级
//        布甲 300 15
//        锁子甲 500 40
public class 对象继承 extends Item {
    int ac;
    public static void main(String[] args) {

        对象继承 s1=new 对象继承();
        对象继承 s2=new 对象继承();
        s1.name="布甲";
        s1.price=15;
        s1.ac=100;
        System.out.println(s1.name+""+s1.price+""+s1.ac);
    }
}
