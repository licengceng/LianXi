package pratice;
//1.java按值传送自变量，即方法调用不会改变自变量的值。
//2.当对象实例作为自变量传送给方法时，自变量的值是对对象的引用，即传送给方法的是引用值
//在方法内，这个自变量的值不会被改变，但可以修改该引用值指向的对象内容
public class 按值传送 {
    float ptValue;

    public static void main(String[] args) {
        String str;
        int val;
        //创建类的实例
        按值传送 pt=new 按值传送();
        val=11;
        pt.changeInt(val);
        System.out.println("Int value is:"+val);

        str=new String("hello");
        pt.changeStr(str);
        System.out.println("Str value is "+str);

        pt.ptValue=101f;
        pt.changeObjValue(pt);
        System.out.println("Current ptVaule is:"+pt.ptValue);
    }
    public void changeInt(int value){
        value=55;

    }
    public void changeStr(String value){
        value=new String("different");

    }
    public void changeObjValue(按值传送 value) {
        value.ptValue = 99f;
    }
}
