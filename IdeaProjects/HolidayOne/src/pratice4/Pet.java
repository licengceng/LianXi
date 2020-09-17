package pratice4;
//根据UML类创建pet（宠物）接口
//1. 提供getName() 返回该宠物的名字
//2. 提供setName(String name) 为该宠物命名
//3. 提供 play()方法
public interface Pet {
    public abstract void setName(String name);
    public abstract String getName(String name);
    default public void play(){
        System.out.println("一起玩");
    };
}
