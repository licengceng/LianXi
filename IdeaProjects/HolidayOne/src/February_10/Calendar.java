package February_10;
//1. 构造方法私有化
//2. 静态属性指向实例
//3. public static的 getInstance方法，返回第二步的静态属性

//饿汉单例式
public class Calendar {
    //构造方法私有化
    private Calendar(){
    }
    //准备一个类属性指向实例对象,因为是类属性所以只有一个
    private static Calendar instance=new Calendar();
    public static Calendar getInstance(){
        return instance;
    }

}
