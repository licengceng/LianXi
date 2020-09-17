package pratice;

public class Continue {
    public static void main(String[] args) {
//
//      Hero hero=new Hero("hero1");
//      Hero hero2=new Hero("hero1");
//      if (hero==hero2){
//          System.out.println("引用相同");
//      }else {System.out.println("引用不相同");}
//        if (hero.name.equals(hero2.name)){
//            System.out.println("值相同");
//        }else {System.out.println("值不相同");}
//        if (hero.equals(hero2)){
//            System.out.println("对象相同");
//        }else {System.out.println("对象不相同");}

        //打印单数
        outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2)
                    break outloop; //如果是双数，结束外部循环
            }

        }

    }
}