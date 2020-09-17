package February_22.集合框架LinkedList与List;
import java.util.LinkedList;
//与FIFO(先入先出的)队列类似的一种数据结构是FILO先入后出栈Stack
//根据接口Stack ：
//实现类：MyStack
//public class MyStack implements Stack
//并向这个栈中，压入5个英雄，接着弹出5个英雄
public class 练习_使用LinkedList实现Stack栈 implements Stack {
    LinkedList<Hero> linkedList=new LinkedList<>();
    //把英雄推入到最后位置
    public void push(Hero h){
        linkedList.add(h);
    }
    //把最后一个英雄取出来
    public Hero pull(){
        return linkedList.removeLast();
    }
    //查看最后一个英雄
    public Hero peek(){
        return linkedList.getLast();
    }
    public static void main(String[] args) {
        练习_使用LinkedList实现Stack栈 heroStack=new 练习_使用LinkedList实现Stack栈();
        for (int i = 0; i <5 ; i++) {
            Hero hero=new Hero("hero"+i);
            System.out.println("压入栈："+hero);
           heroStack.push(hero);
        }
        System.out.println("查看最后一个英雄："+heroStack.peek());
        for (int i = 0; i <5 ; i++) {
            Hero hero=heroStack.pull();
            System.out.println("弹出栈："+hero);
        }
    }
}
