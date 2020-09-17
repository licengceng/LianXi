package February_29.多线程_线程池.开发一个自定义线程池;
import java.util.LinkedList;
//        这是一个自定义的线程池，虽然不够完善和健壮，但是已经足以说明线程池的工作原理
//        缓慢的给这个线程池添加任务，会看到有多条线程来执行这些任务。
//        线程7执行完毕任务后，又回到池子里，下一次任务来的时候，线程7又来执行新的任务。
public class ThreadPool {
        // 线程池大小
        int threadPoolSize;
        // 任务容器
        LinkedList<Runnable> tasks = new LinkedList<Runnable>();
        // 试图消费任务的线程
        public ThreadPool() {
            threadPoolSize = 10;

            // 启动10个任务消费者线程
            synchronized (tasks) {
                for (int i = 0; i < threadPoolSize; i++) {
                    new TaskConsumeThread("任务消费者线程 " + i).start();
                }
            }
        }

        public void add(Runnable r) {
            synchronized (tasks) {
                tasks.add(r);
                // 唤醒等待的任务消费者线程
                tasks.notifyAll();
            }
        }

        class TaskConsumeThread extends Thread {
            public TaskConsumeThread(String name) {
                super(name);
            }
            Runnable task;
            public void run() {
                System.out.println("启动： " + this.getName());
                while (true) {
                    synchronized (tasks) {
                        while (tasks.isEmpty()) {
                            try {
                                tasks.wait();
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        task = tasks.removeLast();
                        // 允许添加任务的线程可以继续添加任务
                        tasks.notifyAll();

                    }
                    System.out.println(this.getName() + " 获取到任务，并执行");
                    task.run();
                }
            }
        }
    }