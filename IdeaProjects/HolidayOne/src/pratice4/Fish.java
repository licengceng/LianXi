package pratice4;
//1. 创建Fish类，它继承Animal类
//2. 重写Animal的walk方法以表明鱼不能走且没有腿。
//3. 实现Pet接口
//4. 无参构造方法
//5. 提供一个private 的name属性
public class Fish extends Animal implements Pet{
    private String name;

    public Fish(){
        name="鱼";
    }
    public  void eat(){
        System.out.println("鱼吃鱼粮");
    }
    public  void setName(String name){
        this.name=name;
    }
    public  String getName(String name){
        System.out.println(name);
        return name;
    };
    @Override
    public void walk() {
        System.out.println("鱼不能走且没有腿");
    }

    public static void main(String[] args) {
        Fish fish=new Fish();
        fish.setName("小鱼1号");
        fish.walk();
        fish.getName(fish.name);
    }
}
