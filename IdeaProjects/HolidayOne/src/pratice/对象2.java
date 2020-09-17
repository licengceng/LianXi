//package pratice;
//class Hero{
//    String name;
//    int hp;
//    void heal(){
//        System.out.println("准备治疗");
//    }
//}
////    设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
////        对Support的heal方法进行重载
////        heal()
////        heal(Hero h) //为指定的英雄加血
////        heal(Hero h, int hp) //为指定的英雄加了hp的血
//public class 对象2 extends Hero{
//    int sp;
//    void heal(对象2 h1,Hero h2){
//        System.out.println(h2.name+"当前为："+h2.hp);
//        int s=50;
//        h2.hp+=s;
//
//        System.out.println(h1.name+"给"+h2.name+"恢复了"+s+"血量，当前"+h2.name+"血量为："+h2.hp);
//    }
//    public static void main(String[] args) {
//        对象2 xx=new 对象2();
//        xx.name="奶妈";
//        xx.hp=200;
//
//        Hero hero1=new Hero();
//        hero1.hp=100;
//        hero1.name="gareen";
//        hero1.heal();
//        xx.heal(xx,hero1);
//
//
//    }
//}
