package pratice3;
public abstract   class Hero {
    String name; //姓名
   final float hp=5; //血量
    float armor; //护甲
    int moveSpeed; //移动速度
    public void attack(){
    }
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
    public static void main(String[] args) {
        //匿名类对象h
        Hero h = new Hero(){
            //当场实现attack方法
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        h.attack();
        //通过打印h，可以看到h这个对象属于Hero$1这么一个系统自动分配的类名
        System.out.println(h);

        class 本地类 extends Hero{
            public void attack(){
                int hp=10;
                System.out.println("本地类进行抽象方法重写"+"\t"+hp);
            }

        }
        本地类 ll=new 本地类();
        ll.attack();
        System.out.println(ll);
        boolean t1=(ll instanceof 本地类);
        boolean t2=(ll instanceof Hero);
        System.out.println(t1+" "+t2);
    }
}