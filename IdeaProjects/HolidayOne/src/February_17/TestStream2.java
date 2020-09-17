package February_17;

import java.io.*;

public class TestStream2 {
//    准备一个长度是10，类型是Hero的数组，使用10个Hero对象初始化该数组
//    然后把该数组序列化到一个文件heros.lol
//    接着使用ObjectInputStream 读取该文件，并转换为Hero数组，验证该数组中的内容，是否和序列化之前一样
    public static void main(String[] args) {
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
//        Hero h1 = new Hero();
//        h1.name = "garen1";
//        h1.hp = 616;
//
//        Hero h2 = new Hero();
//        h2.name = "garen2";
//        h2.hp = 616;
//
//        Hero h3 = new Hero();
//        h3.name = "garen3";
//        h3.hp = 616;
//
//        Hero h4 = new Hero();
//        h4.name = "garen4";
//        h4.hp = 616;
//
//        Hero h5 = new Hero();
//        h5.name = "garen5";
//        h5.hp = 616;
//
//        Hero h6 = new Hero();
//        h6.name = "garen6";
//        h6.hp = 616;
//
//        Hero h7 = new Hero();
//        h7.name = "garen7";
//        h7.hp = 616;
//
//        Hero h8 = new Hero();
//        h8.name = "garen8";
//        h8.hp = 616;
//
//        Hero h9 = new Hero();
//        h9.name = "garen9";
//        h9.hp = 616;
//
//        Hero h10 = new Hero();
//        h10.name = "garen10";
//        h10.hp = 616;
//
//        Hero heros[]=new Hero[]{h1,h2,h3,h4,h5,h6,h7,h8,h9,h10};

        Hero heros[]=new Hero[10];
        for (int i = 0; i <heros.length ; i++) {
            heros[i]=new Hero("hero"+i,666);
        }
        //准备一个文件用于保存该对象
        File file =new File("d:/heros.lol");

        try(
                //创建对象输出流
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
                //创建对象输入流
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
                ){
            objectOutputStream.writeObject(heros);

             Hero hero[]=(Hero[]) objectInputStream.readObject();
            for (int i = 0; i <hero.length ; i++) {
                System.out.print("name:"+hero[i].name);
                System.out.print("\thp:"+hero[i].hp);
                System.out.println("\n");
            }

        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
