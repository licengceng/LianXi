package pratice2;



public class 对象 {
    public String name = "some hero";

    public 对象(){
        name = "one hero";
    }
    {
        name = "the hero";
    }

    public static void main(String[] args) {
        对象 s=new 对象();
        System.out.println(s.name);

    }
}