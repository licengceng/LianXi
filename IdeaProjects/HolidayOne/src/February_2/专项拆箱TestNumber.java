package February_2;
public class 专项拆箱TestNumber {

    public static void main(String[] args) {
        int i = 5;
        //把一个基本类型的变量,转换为Integer对象 (基本类型转换成封装类型)
        Integer it = new Integer(i);
        System.out.println(it);
        //把一个Integer对象，转换为一个基本类型的int
        Integer integer=new Integer(56);
        int i2 = it.intValue();
        Integer i3=i;  //不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
        int a=integer;         //不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱
        System.out.println("a:"+a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}