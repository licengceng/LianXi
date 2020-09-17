package February_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
        int year;
        Date date=new Date(2020,02,10);
        System.out.println(date);
        System.out.println("先判断1995是闰年还是平年：");
        if (1995%100==0||1995%400==0){
            year=366;  //闰年
            System.out.println("闰年");
        }else {
            year=365;
            System.out.println("平年");
        }

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s1="1995-1-1 00:00:00";
        String s2="1995-12-31 23:59:59";
        try {
           Date startup=simpleDateFormat.parse(s1);
           long b=startup.getTime()+(long)(Math.random()*24*60*60*year*1000);
           Date randomDate=new Date(b);
            System.out.println(randomDate);

        }catch (ParseException e){
            e.printStackTrace();
        }
    }

}
