package pratice3;
//为Item类设计一个抽象方法
//
//public abstract boolean disposable()
//        不同的子类，实现disposable后，会返回不同的值。
//        比如LifePotion就会返回true，因为是会消失了。
//        而Weapon,Armor 就会返回false,因为是不会消失了
public class LifePotion extends Item {
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
    public boolean disposable(){
       return true;
    }

    public static void main(String[] args) {
        LifePotion lifePotion=new LifePotion();
        lifePotion.disposable();
    }
}