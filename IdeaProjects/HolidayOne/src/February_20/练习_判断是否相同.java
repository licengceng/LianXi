package February_20;

import java.lang.reflect.Array;
import java.util.ArrayList;
//如果就是要判断集合里是否存在一个 name等于 "hero 1"的对象，应该怎么做？
public class 练习_判断是否相同 {
    public static void main(String[] args) {
        ArrayList heros=new ArrayList();
        for (int i = 0; i <5 ; i++) {
            heros.add(new Hero("hero"+i));
        }
        System.out.println(heros);
        int count=0;
        int index=0;
        Hero hs[]=(Hero[])heros.toArray(new Hero[]{});
        for (int i = 0; i <hs.length ; i++) {
            //注：字符串是引用类型，equals比较对象的内容是否相同，==比较两个引用是否指向同一个对象，此处比较若用==判断则结果有误
            if (hs[i].name.equals("hero1")){
                index=i;
                count++;
            }
        }
        System.out.printf("存在%d个name等于\"hero1\"的对象，下标为%d",count,index);
    }
}
//法二
//        ArrayList heros = new ArrayList();
//        for (int i = 0; i < 5; i++) {
//             heros.add(new Hero("hero " + i));
//        }
//        Hero specialHero = new Hero("special hero");
//        heros.add(specialHero);
//        String name = "hero 1";
//        for (int i = 0; i < heros.size(); i++) {
//                 Hero h = (Hero) heros.get(i);
//              if(name.equals(h.name ) ){
//                  System.out.printf("找到了name是%s的对象",name);
//                  break;
//            }
//        }