package February_29;
//Thread.sleep(1000); 表示当前线程暂停1000毫秒 ，其他线程不受影响
//        Thread.sleep(1000); 会抛出InterruptedException 中断异常，
//        因为当前线程sleep的时候，有可能被停止，这时就会抛出 InterruptedException
public class 当前线程暂停_sleep {
    public static void main(String[] args) {

      Thread t1=new Thread(){
          public void run(){
            int seconds=0;
            while(true){
                try {
                    Thread.sleep(1000);  //Thread表示当前线程
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.printf("已经玩了LOL %d 秒%n", seconds++);
            }
          }
      };
        t1.start();
    }
}
