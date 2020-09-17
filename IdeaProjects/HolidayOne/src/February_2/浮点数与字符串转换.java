package February_2;
//参考上述步骤
//把浮点数 3.14 转换为 字符串 "3.14"
//再把字符串 “3.14” 转换为 浮点数 3.14
//如果字符串是 3.1a4，转换为浮点数会得到什么？
public class 浮点数与字符串转换 {
    public static void main(String[] args) {
        //浮点数转字符串
        //方法1 使用String类的静态方法valueOf
        float a=3.14f;
        String string =String.valueOf(a);
        System.out.println(string);
        //方法2 先把基本类型装箱为对象，然后调用对象的toString
        Float aa=a;
        String str=aa.toString();
        System.out.println(aa.toString());

        //字符串转浮点数
        // 字符串转数字 调用Integer的静态方法parseInt(Float.parseFloat)
        float a5=Float.parseFloat(str);
        System.out.println(a5);

        //抛出异常：NumberFormatException
        String kk="3.1a4";
//        System.out.println(Float.parseFloat(kk));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.E);
    }
}
