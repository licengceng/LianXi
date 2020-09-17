package test;

public class GiantDragon2 {
    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon2(){}
    //准备一个类属性，用于指向一个实例化对象，但是暂时指向null
    private static GiantDragon2 instance;
   public static GiantDragon2 getInstance(){
        if (instance==null){
            instance=new GiantDragon2();
        }
        return instance;
   }

    public static void main(String[] args) {
        //通过new实例化会报错
//      GiantDragon g = new GiantDragon();

        //只能通过getInstance得到对象

        GiantDragon2 g1 = GiantDragon2.getInstance();
        GiantDragon2 g2 = GiantDragon2.getInstance();
        GiantDragon2 g3 = GiantDragon2.getInstance();

        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
        System.out.println(g1);
        System.out.println(g1.toString());
    }

}
