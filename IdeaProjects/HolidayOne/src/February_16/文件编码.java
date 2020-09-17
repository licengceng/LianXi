package February_16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class 文件编码 {
    public static void main(String[] args) {
        File file=new File("d:/bianma.txt");
        try(FileInputStream fileInputStream=new FileInputStream(file)){
            byte all[]=new byte[(int)file.length()];
            fileInputStream.read(all);
            //文件中读出来的数据是
            System.out.println("文件中读出来的数据是：");
            for (byte b : all)
            {
                int i = b&0x000000ff;  //只取16进制的后两位
                System.out.println(Integer.toHexString(i));
            }
            String str = new String(all,"UTF-8");
            System.out.println(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
