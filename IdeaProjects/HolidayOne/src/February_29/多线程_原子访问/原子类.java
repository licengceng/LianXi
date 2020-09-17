package February_29.多线程_原子访问;

import java.util.concurrent.atomic.AtomicInteger;

//JDK6 以后，新增加了一个包java.util.concurrent.atomic，里面有各种原子类，比如AtomicInteger。
//而AtomicInteger提供了各种自增，自减等方法，这些方法都是原子性的。 换句话说，
// 自增方法 incrementAndGet 是线程安全的，同一个时间，只有一个线程可以调用这个方法。
public class 原子类 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicI =new AtomicInteger();
        int i = atomicI.decrementAndGet();//-1
        int j = atomicI.incrementAndGet();//0
        int k = atomicI.addAndGet(3);//3
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }

}