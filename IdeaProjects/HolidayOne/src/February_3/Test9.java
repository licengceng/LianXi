package February_3;

public class Test9 {
    public static String randomString(){
        //        char start='0';
        short start='a';                //        short a1=(short)start;
        //        char end='z'+1;
        short end='z'+1;                //        short a2=(short)end;
        char cs[]=new char[5];
        for (int i = 0; i <cs.length; i++) {
            while (true){char c=(char)(Math.random()*(end-start)+start);
                if (Character.isLetter(c)||Character.isDigit(c))
                    cs[i]=c;
                break;
            }
        }
        String result=new String(cs);
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
//        创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
//        给点提示: 数字和字符之间可以通过互相转换
//        char a='A';
//        short b=(short)a;
//        System.out.println(a+" "+b);
        char cs[] = new char[5];
        for (int i = 0; i < cs.length; i++) {
            while (true) {
                char c = (char) (Math.random() * 125);
                if (Character.isLetter(c) || Character.isDigit(c)) {
                    cs[i] = c;
                    break;
                }
            }
        }
        String result = new String(cs);
        System.out.println(result);
//       randomString();

    }
}
