package February_20;

public class Hero {
    public  int hp;
    public String name;
    public Hero(){}
    public Hero(String name){
        this.name=name;
//        System.out.println("先调用父类构造方法");
    }
    // 重写toString方法
    public String toString() {
        return name;
    }
    public  int getHp(){
        return hp;
    }
}
