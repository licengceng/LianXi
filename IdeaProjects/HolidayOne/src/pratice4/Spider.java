package pratice4;
//1. Spider继承Animal类。
//2. 定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
//3. 实现eat方法
public class Spider extends Animal {

    String name;
    public  void eat(){
        System.out.println("蜘蛛吃");
    }
    public Spider(){
         super(8);

    }

    @Override
    public void walk(int legs) {

        System.out.println("用"+legs+"只腿爬行");

    }

    public static void main(String[] args) {
        Spider spider=new Spider();
        spider.name="蜘蛛";
        System.out.println(spider.legs);
       spider.eat();
        spider.walk();

    }
}
