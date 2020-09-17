package February_25.集合框架HashSet;
import java.util.Iterator;
//创建一个长度是100的字符串数组
//        使用长度是2的随机字符填充该字符串数组
//        统计这个字符串数组里重复的字符串有多少种
public class HashSet统计重复字符串 {
    public static void main(String[] args) {

        String string[]=new String[100];
        char str[]=new char[2];

        for (int i = 0; i <string.length ; i++) {
            for (int j = 0; j <str.length ; j++) {
                while (true){
                    char a =(char)(Math.random()*125);
                    if (Character.isLetter(a)||Character.isDigit(a)){ //是数字或字母添加到字符数组
                        str[j]=a;
                        break;
                    }
                }
            }
            string[i]=new String(str);
        }
        for (int i = 0; i < 5; i++) {  //5行20列输出
            for (int j = 0; j <20 ; j++) {
                System.out.print(string[(i*5+j)]+" ");
            }
            System.out.println("\n");
        }
        HashSet<String> result=new HashSet<>();

        for (String s1:string) {
            int repeat=0;
            for (String s2:string) {
                if (s1.equals(s2)){
                    repeat++;
                    // 当repeat==2的时候，就找到了一个非己的重复字符串
                    if (repeat==2){
                        result.add(s2);
                        break;
                    }
                }
            }
        }

        System.out.printf("总共有 %d种重复的字符串%n", result.size());
        if (result.size()!=0){
            System.out.println("它们是：");
            for (String s:result) {
                System.out.println(s+" ");
            }
        }
    }
}
