package February_17;

import java.io.*;
import java.nio.charset.Charset;
//使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字
public class 练习_向文件中写入两个数字再分别读取出来方法一 {
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
            int i1=dataInputStream.readInt();
            int i2=dataInputStream.readInt();


            System.out.println("读取到第一个整数:"+i1);
            System.out.println("读取到第二个整数:"+i2);

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
            dataOutputStream.writeInt(38);
            dataOutputStream.writeInt(965);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
