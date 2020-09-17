package February_3;

public class Test4 {
    public static void main(String[] args) {
        //把 lengendary 最后一个字母变大写
        String string="lengendary";

        String string2=string.substring(0,string.length()-1)+string.substring(string.length()-1).toUpperCase();
        System.out.println(string); //lengendary
        System.out.println(string2);//lengendarY

    }
}
