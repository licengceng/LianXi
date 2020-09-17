package February_2;

import java.util.Scanner;

//借助Scanner 读取字符串数据，然后用格式化输出下面
//
//浙江温州最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，带着他的小姨子跑了!我们没有办法，拿着钱包抵工资!
// 原价都是一百多、两百多、三百多的钱包，现在全部只卖二十块，统统只要二十块!
// 黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!
public class Printf_Test {
    public static void main(String[] args) {
        System.out.println("请输入地名：");
        Scanner scanner1=new Scanner(System.in);
        String diming=scanner1.nextLine();

        System.out.println("请输入公司类型：");
        Scanner scanner2=new Scanner(System.in);
        String gongsi=scanner2.nextLine();

        System.out.println("请输入公司名称：");
        Scanner scanner3=new Scanner(System.in);
        String mingchen=scanner3.nextLine();

        System.out.println("请输入老板名称：");
        Scanner scanner4=new Scanner(System.in);
        String boss=scanner4.nextLine();

        System.out.println("请输入金额：");
        Scanner scanner5=new Scanner(System.in);
        int jine=scanner5.nextInt();

        System.out.println("请输入产品：");
        Scanner scanner6=new Scanner(System.in);
        String chanpin=scanner6.nextLine();

        System.out.println("请输入价格计量单位：");
        Scanner scanner7=new Scanner(System.in);
        String danwei=scanner7.nextLine();
        System.out.printf("%s" +
                "最大" +
                "%s" +
                "倒闭了，王八蛋老板" +"%s"+
                "吃喝嫖赌，欠下了" +"%d"+
                "个亿，带着他的小姨子跑了!我们没有办法，拿着" +"%s"+
                "抵工资!原价都是一" +"%s"+
                "多、两" +"%s"+
                "多、三" +"%s"+
                "多的钱包，现在全部只卖二十块，统统只要二十块!" +"%s"+
                "王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱! ",diming,gongsi,boss,jine,chanpin,danwei,danwei,danwei,chanpin,boss);
    }
}
