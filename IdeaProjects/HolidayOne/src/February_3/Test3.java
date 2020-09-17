package February_3;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        //把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
        String string="lengendary";
        String s[]=new String[10];

        for (int i = 0; i <string.length() ; i++) {
                if (i%2==0){
                   s[i]= string.substring(i,i+1).toUpperCase();
                   // System.out.println(s[i]);
                }
                else {
                    s[i]=string.substring(i,i+1);
                   // System.out.println(s[i]);
                }
            }

        for (int i = 0; i <s.length ; i++) {
            System.out.print(s[i]);
        }

        }
    }

