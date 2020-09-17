package pratice;

public class lianxi1 {
    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        System.out.println(getType((a+b)));
        short c = (short)(a+b);
        System.out.println(getType(c));
    }
    private static String getType(Object a)
    {
        return a.getClass().toString();

    }

}
