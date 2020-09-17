package pratice;
public class 继承类lian1 {
    public int a = 5;
    private int b = 3;

    public int getB() {
        return b;
    }

    protected int c = 8;
}
    class lian2 extends 继承类lian1 {
        public int d;

        public void tryVariables() {
            System.out.println(a);
//        System.out.println(b);
            System.out.println(getB());
            System.out.println(c);
            System.out.println(d);
        }

        public static void main(String[] args) {
            lian2 l2 = new lian2();
            l2.tryVariables();
        }

}