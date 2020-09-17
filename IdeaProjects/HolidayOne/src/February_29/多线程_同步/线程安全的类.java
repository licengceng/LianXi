package February_29.多线程_同步;
//如果一个类，其方法(*都是有)synchronized修饰的，那么该类就叫做线程安全的类
//        同一时间，只有一个线程能够进入 这种类的一个实例 的去修改数据，进而保证了这个实例中的数据的安全
//        (不会同时被多线程修改而变成脏数据)

//比如StringBuffer和StringBuilder的区别
//        StringBuffer的方法都是有synchronized修饰的，StringBuffer就叫做线程安全的类
//        而StringBuilder就不是线程安全的类
//public synchronized StringBuffer append(int i) {
//        toStringCache = null;
//        super.append(i);
//        return this;
//        }
public class 线程安全的类 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(5);
    }
}
