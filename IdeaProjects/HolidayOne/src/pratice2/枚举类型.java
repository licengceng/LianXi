package pratice2;

import java.util.EnumMap;

public class 枚举类型 {
    public static void main(String[] args) {
       Season season=Season.Spring;
//        switch (season){
//            case Spring:
//                System.out.println("春天"+" "+season); break;
//            case Summer:
//                System.out.println("秋天");break;
//            case Autumn:
//                System.out.println("秋天");break;
//            case Winter:
//                System.out.println("冬天");break;
//        }
        for (ENUM s:ENUM.values()) {
            switch (s){
                case TANK:
                    System.out.println("坦克"); break;
                case ASSIST:
                    System.out.println("辅助");break;
                default:
                    System.out.println("人头");break;
            }

            }

        }
    }

