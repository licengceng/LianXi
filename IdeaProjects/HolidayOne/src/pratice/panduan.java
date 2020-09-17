package pratice;

import java.util.Scanner;

public class panduan {
    public static void main(String[] args) {
        System.out.println("请输入日期:");
        Scanner scanner=new Scanner(System.in);

        int today=scanner.nextInt();
       outer: switch (today){
            case 1:
                System.out.println("今天是周一");break;
            case 2:
                System.out.println("今天是周二");break;
            case 3:
                System.out.println("今天是周三");break;
            case 4:
                System.out.println("今天是周四");break;
            case 5:
                System.out.println("今天是周五");break;
            case 6:
                System.out.println("今天是周六");break;
            case 7:
                System.out.println("今天是周日");break;
            default:
                System.out.println("输入错误，请重新输入");
                scanner=new Scanner(System.in);
                today=scanner.nextInt();
                switch (today){
                    case 1:
                        System.out.println("今天是周一");break;
                    case 2:
                        System.out.println("今天是周二");break;
                    case 3:
                        System.out.println("今天是周三");break;
                    case 4:
                        System.out.println("今天是周四");break;
                    case 5:
                        System.out.println("今天是周五");break;
                    case 6:
                        System.out.println("今天是周六");break;
                    case 7:
                        System.out.println("今天是周日");break;
                    default:
                        System.out.println("输入错误，请重新输入");
                }
        }
      if(1<=today&&today<=7){
          int k=today>5?1:2;
          if (k==1) System.out.println("今天是周天");
          else {
              System.out.println("今天不是周天");
          }
      }
    }
}
