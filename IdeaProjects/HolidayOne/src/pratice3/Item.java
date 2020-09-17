package pratice3;
//为Item类设计一个抽象方法
//
//public abstract boolean disposable()
//        不同的子类，实现disposable后，会返回不同的值。
//        比如LifePotion就会返回true，因为是会消失了。
//        而Weapon,Armor 就会返回false,因为是不会消失了
public abstract class Item {
    String name;
    int price;
    public abstract boolean disposable();
    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果 ");
    }

    public static void main(String[] args) {
        Item i1= new LifePotion();
//        Item i2 = new MagicPotion();
        System.out.print("i1  是Item类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        //i2.effect();
    }

}
