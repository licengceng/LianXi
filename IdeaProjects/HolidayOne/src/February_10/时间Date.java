package February_10;

import java.util.Date;

public class 时间Date {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);//Mon Feb 10 13:16:07 CST 2020
        System.out.println(date.toString());//Mon Feb 10 13:16:07 CST 2020
       // getTime() 得到一个long型的整数 这个整数代表 从1970.1.1 08:00:00:000 开始 每经历一毫秒，增加1
        System.out.println(date.getTime());             //1581311967810
        //当前日期的毫秒数new Date().getTime() 和 System.currentTimeMillis() 是一样的
        // 不过由于机器性能的原因，可能会相差几十毫秒，毕竟每执行一行代码，都是需要时间的
        System.out.println(System.currentTimeMillis());//1581311967885

        //从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date date1=new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(date1);//Thu Jan 01 08:00:05 CST 1970
    }
}
