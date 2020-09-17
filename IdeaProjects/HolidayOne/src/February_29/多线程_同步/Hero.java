package February_29.多线程_同步;
//假设盖伦有10000滴血，并且在基地里，同时又被对方多个英雄攻击
//就是有多个线程在减少盖伦的hp
//同时又有多个线程在恢复盖伦的hp
//假设线程的数量是一样的，并且每次改变的值都是1，那么所有线程结束后，盖伦应该还是10000滴血。
//但是。。。
//注意： 不是每一次运行都会看到错误的数据产生，多运行几次，或者增加运行的次数
public class Hero{
    public String name;
    public float hp;
    public int damage;
    //回血
    public void recover(){
        hp=hp+1;
    }
    //掉血
    public void hurt(){
        hp=hp-1;
    }
    public void attackHero(Hero h) {
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name +"死了！");
    }
    public boolean isDead() {
        return 0>=hp?true:false;
    }

}