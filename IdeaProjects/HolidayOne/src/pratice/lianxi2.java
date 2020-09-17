package pratice;
public class lianxi2 {
    int i = 1; //属性名是i
    public void method1(int i){ //参数也是i
        System.out.println(this.i);
    }
    public void method2(final int j) {
        System.out.println("j:"+j);
        //j = 5; //这个能否执行？
    }
    public static void main(String[] args) {
        new lianxi2().method1(5);
        //结果打印出来是 1还是5?
        new lianxi2().method2(1);
    }
}



