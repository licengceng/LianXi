package February_29.多线程_死锁.练习_死锁;
//3个同步对象a, b, c
//3个线程 t1,t2,t3
//故意设计场景，使这3个线程彼此死锁
public class TestThread {
    public static void main(String[] args) {
        Person person1=new Person("a");
        Person person2=new Person("b");
        Person person3=new Person("c");
        Thread thread1=new Thread(){
          public void run(){
              synchronized(person1){
                  try{
                      System.out.println("线程"+this.getName()+"已占据"+person1.name);
                      Thread.sleep(1000);

                  }catch (InterruptedException e){
                      e.printStackTrace();
                  }
                  System.out.println("线程"+this.getName()+"试图占据"+person2.name+",等待中。。。");
                  synchronized(person2){
                      System.out.println("线程"+this.getName()+"已占据"+person2.name);
                  }
              }
          }
        };
        thread1.setName("t1");
        Thread thread2=new Thread(){
            public void run(){
                    synchronized (person2){
                        System.out.println("线程"+this.getName()+"已占据"+person2.name);
                        try{
                            Thread.sleep(1000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println("线程"+this.getName()+"试图占据"+person3.name+"等待中。。。");
                        synchronized (person3){
                            System.out.println("线程"+this.getName()+"已占据"+person3.name);
                        }
                    }
            }
        };
        thread2.setName("t2");
        Thread thread3=new Thread(){
            public void run(){
                synchronized (person3){
                    System.out.println("线程"+this.getName()+"已占据"+person3.name);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("线程"+this.getName()+"试图占据"+person1.name+"等待中。。。");
                    synchronized (person1){
                        System.out.println("线程"+this.getName()+"已占据"+person1.name);
                    }
                }
            }
        };
        thread3.setName("t3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
