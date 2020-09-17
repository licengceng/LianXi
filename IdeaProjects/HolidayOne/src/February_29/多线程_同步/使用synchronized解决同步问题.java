package February_29.多线程_同步;
//所有需要修改hp的地方，有要建立在占有someObject的基础上。
//        而对象 someObject在同一时间，只能被一个线程占有。 间接地，导致同一时间，hp只能被一个线程修改。
public class 使用synchronized解决同步问题 {
    public static void main(String[] args) {
        final Object someObject = new Object();
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 10000;
        int n = 10000;
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
//      2.  在recover前，直接加上synchronized ，其所对应的同步对象，就是this
//                和hurt方法达到的效果是一样
//        外部线程访问gareen的方法，就不需要额外使用synchronized 了
        //回血
        //直接在方法前加上修饰符synchronized
        //其所对应的同步对象，就是this
        //和hurt方法达到的效果一样
//        public synchronized void recover(){
//            hp=hp+1;
//        }
//
//        //掉血
//        public void hurt(){
//            //使用this作为同步对象
//            synchronized (this) {
//                hp=hp-1;
//            }
//        }


//       1.使用gareen作为synchronized
//        synchronized (gareen) {
//            gareen.recover();
//        }
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //任何线程要修改hp的值，必须先占用someObject
                    synchronized (someObject) {
                        gareen.recover();
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;

        }

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //任何线程要修改hp的值，必须先占用someObject
                    synchronized (someObject) {
                        gareen.hurt();
                    }

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }
        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,gareen.hp);

    }

}
