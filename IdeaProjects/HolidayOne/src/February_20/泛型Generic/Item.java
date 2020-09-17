package February_20.泛型Generic;
//不指定泛型的容器，可以存放任何类型的元素
//指定了泛型的容器，只能存放指定类型的元素以及其子类
public class Item {
    String name;
    int price;

    public Item(){
    }
    //提供一个初始化name的构造方法
    public Item(String name){
        this.name = name;
    }

    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

}