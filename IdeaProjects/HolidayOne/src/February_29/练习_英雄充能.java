package February_29;

import February_29.线程优先级_setPriority.Hero;

//英雄有可以放一个技能叫做: 波动拳-a du gen。
//        每隔一秒钟，可以发一次，但是只能连续发3次。
//        发完3次之后，需要充能5秒钟，充满，再继续发。
//        借助本章节学习到的知识点，实现这个效果
public class 练习_英雄充能 {
    public static void main(String[] args) {
        Hero hero=new Hero();
        Thread thread=new Thread(){
            public void run(){
                while (true){
                    try{
                        for (int i = 1; i <4 ; i++) {
                            System.out.println(hero.jineng()+"第"+i+"发");
                            Thread.sleep(1000);
                        }
                        System.out.println("需要充能5秒");
                        Thread.sleep(5000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}
