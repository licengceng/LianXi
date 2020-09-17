package February_17;

import java.io.*;
import java.nio.charset.Charset;

public class 数据流_直接进行字符串的读写 {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset());
        write();
        read();
    }

    private static void read() {
        File file =new File("d:/lol.txt");
        try(
                FileInputStream fileInputStream=new FileInputStream(file);
                DataInputStream dataInputStream=new DataInputStream(fileInputStream);
                ){
            int i=dataInputStream.readInt();
            Boolean b=dataInputStream.readBoolean();
            String str= dataInputStream.readUTF();
            System.out.println("读取到布尔值:"+b);
            System.out.println("读取到整数:"+i);
            System.out.println("读取到字符串:"+str);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void write() {
        File file =new File("d:/lol.txt");
        try(
                FileOutputStream fileOutputStream=new FileOutputStream(file);
                DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);
                ){
            dataOutputStream.writeInt(3);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeUTF("123 this is gareen");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}