package February_3;

public class Character包装类的方法 {
    public static void main(String[] args) {


        System.out.println(Character.isLetter('a'));//判断是否为字母 true
        System.out.println(Character.isDigit('a')); //判断是否为数字 false
        System.out.println(Character.isWhitespace(' ')); //是否是空白 true
        System.out.println(Character.isUpperCase('a')); //是否是大写
        System.out.println(Character.isLowerCase('a')); //是否是小写

        System.out.println(Character.toUpperCase('a')); //转换为大写 A
        System.out.println(Character.toLowerCase('A')); //转换为小写 a

     //   String a = 'a'; //不能够直接把一个字符转换成字符串
        String a2 = Character.toString('a'); //转换为字符串
        System.out.println(a2);

    }
}
