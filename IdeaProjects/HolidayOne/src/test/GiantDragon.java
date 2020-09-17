package test;
//饿汉模式：1. 构造方法私有化
//         2. 静态属性指向实例
//         3. public static的 getInstance方法，返回第二步的静态属性
public class GiantDragon {
    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){
    }
    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    private static GiantDragon instance=new GiantDragon();
    //public static 方法，提供给调用者获取定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        //通过new实例化会报错
//      GiantDragon g = new GiantDragon();

        //只能通过getInstance得到对象

        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();

        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }
}
