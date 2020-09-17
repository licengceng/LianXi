package February_12;
//假设有一个方法 public int method()， 会返回一个整数
//在这个方法中有try catch 和 finally.
//try 里返回 1
//catch 里 返回 2
//finally 里 返回3
//那么，这个方法到底返回多少？
public class Test {
    public static void main(String[] args) {
        int a=method(1);
        System.out.println(a);
    }
    public static int method(int a){
        try {
          return a;
        }catch (Exception e){
            e.printStackTrace();
            a=2;
            return a;
        }
    }
}
