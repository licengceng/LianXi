package February_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 日期格式 {
    public static void main(String[] args) {
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒

        //日期转字符串 new SimpleDateFormat().format()
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d1= new Date();
        String str1 = sdf1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);

        //字符串转日期   new SimpleDateFormat.parse()
        //模式（yyyy/MM/dd HH:mm:ss）需要和字符串格式保持一致，如果不一样就会抛出解析异常ParseException
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );

        String str2 = "2016-1-5 12:12:12";

        try {
            Date d2 = sdf2.parse(str2);
            System.out.printf("字符串 %s 通过格式  yyyy-MM-dd HH:mm:ss %n转换为日期对象: %s",str2,d2.toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
