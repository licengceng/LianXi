package February_17;

import java.io.*;

public class TestStream {
    public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        Hero h = new Hero();
        h.name = "garen";
        h.hp = 616;
        //准备一个文件用于保存该对象
        File file =new File("d:/garen.lol");
        try(
                //创建对象输出流
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
                //创建对象输入流
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
        ) {
            objectOutputStream.writeObject(h);
            Hero h2 = (Hero) objectInputStream.readObject();
            System.out.println(h2.name);
            System.out.println(h2.hp);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}