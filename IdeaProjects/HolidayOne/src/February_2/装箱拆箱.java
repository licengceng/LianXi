package February_2;
//1. 对byte,short,float,double进行自动拆箱和自动装箱
//2. byte和Integer之间能否进行自动拆箱和自动装箱
//3. 通过Byte获取byte的最大值
public class 装箱拆箱 {
    public static void main(String[] args) {
        float a=new Float(5.0);//不需要floatValue()方法，自动拆箱
        System.out.println(a);
        float b=6.0f;
        Float s=b;       //不需要构造方法，自动装箱
        System.out.println(s);

        //byte和Integer不能直接进行自动装箱必须强转,不能自动拆箱
         byte bb=4;
         Integer integer=(int)bb;
       //  bb=new Integer(5);

        System.out.println(bb+" "+Byte.MAX_VALUE+" "+Byte.MIN_VALUE);
    }
}
