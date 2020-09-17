package February_29.多线程_lock对象;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//synchronized 是不占用到手不罢休的，会一直试图占用下去。
//        与 synchronized 的钻牛角尖不一样，Lock接口还提供了一个trylock方法。
//        trylock会在指定时间范围内试图占用； 如果时间到了，还占用不成功就不占领~
//        注意： 因为使用trylock有可能成功，有可能失败，所以后面unlock释放锁的时候，需要判断是否占用成功了，
//        如果没占用成功也unlock,就会抛出异常
public class trylock方法 {
    public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
    public static void log(String msg){
        System.out.printf("%s %s %s %n",now(),Thread.currentThread().getName(),msg);
    }

    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        Thread t1=new Thread(){
          public void run(){
              boolean locked=false;
              try {
                    log("线程启动");
                    log("试图占有对象:lock");
                    locked=lock.tryLock(1, TimeUnit.SECONDS);
                    if (locked){
                        log("占有对象:lock");
                        log("进行5秒业务操作");
                        Thread.sleep(5000);
                    }else {
                        System.out.println(this.getName()+"经过一秒钟的努力，还没有占领对象，放弃占领");
                    }
              }catch (InterruptedException e){
                  e.printStackTrace();
              }finally {
                  if (locked){
                      log("释放对象");
                      lock.unlock();
                  }
              }
                log("线程结束");
          }
        };
        t1.setName("t1");
        t1.start();
        try {
            //先让t1飞2秒
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Thread t2=new Thread(){
            public void run(){
                boolean locked=false;
                try {
                    log("线程启动");
                    log("试图占领对象：lock");
                    locked=lock.tryLock(1,TimeUnit.SECONDS);
                    if (locked){
                        log("占有对象：lock");
                        log("进行五秒业务操作");
                        Thread.sleep(5000);
                    }else{
                        System.out.println(this.getName()+"经过1秒的努力，还没有占领对象，放弃占领");
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    if (locked){
                        log("释放对象:lock");
                        lock.unlock();
                    }
                }
                log("线程结束");
            }
        };
        t2.setName("t2");
        t2.start();
    }
}
