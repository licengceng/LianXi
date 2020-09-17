package February_12;

public class Pratice1 {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    private static int method1() {
        try {
            int i = 5/0;
            return 1;
        }catch (Exception e) {
            return 2;
        }finally {
            return 3;
        }
    }
}