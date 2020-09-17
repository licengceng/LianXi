package pratice;



public class 对象 {
    public String name;
    public static void main(String[] args) {
        对象 h1=new 对象();
        对象 h2=new 对象();
        对象 h3;
        对象 h4;
        h3=h1;
        h4=h3;
        System.out.println(h4);
        System.out.println(h2);
        if(h4.equals(h2))
            System.out.println("true");
        else {
            System.out.println("fasle");
        }
    }
}