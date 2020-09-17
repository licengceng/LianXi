package February_3;

import java.util.Arrays;
//char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
public class Test7 {
    public static void main(String[] args) {
        //创建一个长度是100的字符串数组
        //使用长度是2的随机字符填充该字符串数组
        //统计这个字符串数组里重复的字符串有多少种
        String string = "";//提前声明重复的字符串
        String[] str = new String[100];
        char a[]=new char[2];

        int count=0;
        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j <2 ; j++) {

                while (true){
                    char c=(char) (Math.random()*125);
                    if (Character.isLetter(c)||Character.isDigit(c)){
                        a[j]=c;
                        break;
                    }
                }
            }
            str[i]=new String(a);
        }
        //让数组成5*20排列
        for(int i=0;i<5;i++){
            for(int j=0;j<20;j++){
                System.out.print(str[(20*i)+j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i <str.length-1 ; i++) {
            for (int j = i+1; j <str.length; j++) {
                if (str[i].equals(str[j])){
                    count++;
                    string+=str[i]+" ";
                    break;
                }
            }
        }
        System.out.println("总共有"+count+"重复字符串");
        System.out.println(string);
    }
}
