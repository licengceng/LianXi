package February_21;
import February_20.Hero;
import java.util.ArrayList;
import java.util.Iterator;

//首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
//hero 0
//hero 1
//hero 2
//...
//hero 99.
//通过遍历的手段，删除掉名字编号是8的倍数的对象
public class 练习_删除ArrayList中的数据 {
    //这个练习的考点是，不能够在使用Iterator和增强for循环遍历数据的同时，删除数据，否则会抛出ConcurrentModificationException
    //解决办法，是准备一个临时容器，专门用来保存需要删除的对象。 然后再删掉
    public static void main(String[] args) {
        ArrayList<Hero> heros=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            heros.add(new Hero("hero"+i));
        }
        System.out.println(heros+"\n");
        ArrayList<Hero> deleteHero=new ArrayList<>();
        for (int i = 0; i < heros.size(); i++) {
          int id= Integer.parseInt(heros.get(i).name.substring(4));
          if (id%8==0){
              deleteHero.add(heros.get(i));
          }
        }

        for (Hero h:deleteHero) {
            heros.remove(h);
        }    //或直接通过removeAll删除多个Hero对象     heros.removeAll(deleteHero);

   //      System.out.println(heros);
        Iterator<Hero> heroIterator=heros.iterator();
      while (heroIterator.hasNext()){
            Hero hero=heroIterator.next();
            System.out.print(hero+" ");
        }
        }
    }

