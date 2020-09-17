package pratice2;

public class Hero {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero(){

    }

    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero h){
        h = new Hero("提莫",383);
    }

    public static void main(String[] args) {
        Hero teemo =  new Hero("提莫",383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;
        System.out.println(teemo.hp);
        teemo.revive(teemo);

        System.out.println(teemo.hp); //输出多少？ 怎么理解？
//        输出是-17,teemo调用了revive()方法将teemo引用的对象的内存地址,发送给了revive()方法内的h对象,但是revive()方法为h引用
//        重新new的一个对象,指向了不同的内存地址,teemo引用的对象没有受到任何改变,被改变的是h引用的对象,所以方法外的teemo还是原来的对象.
//        如果将revive()方法把h引用的对象return出来,并赋给teemo,这时候teemo引用的对象才会指向h引用的对象.

//        public Hero revive(Hero h){
//            return h = new Hero("提莫",383);
//        }
//
//        public static void main(String[] args) {
//            Hero teemo =  new Hero("提莫",383);
//
//            //受到400伤害，挂了
//            teemo.hp = teemo.hp - 400;
//
//            teemo = teemo.revive(teemo);//这时候teemo引用的对象才发生了改变.指向了h引用的对象.
//
//            System.out.println(teemo.hp); //这时候输出结果为383
//        }
    }

}