package February_10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

    //重写tostring,提取出日期中的时间
    private static String toString(Date date,String string){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(string);

        return simpleDateFormat.format(date);
    }
    public static void main(String[] args) throws Exception {
        //准备一个长度是9的日期数组
        //使用1970年-2000年之间的随机日期初始化该数组
        //按照这些日期的时间进行升序排序
        //比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
        Date dates[] = new Date[9];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String startup = "1970-01-01 00:00:00";
        String endtup = "2000-12-31 23:59:59";
        Date date = simpleDateFormat.parse(startup);
        Date date2 = simpleDateFormat.parse(endtup);
        for (int i = 0; i < dates.length; i++) {
            dates[i] = new Date((long) (Math.random() * date2.getTime() - date.getTime()));
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(dates[i*3+j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("按时间排序输出：");
        for (int i = 0; i <dates.length-1 ; i++) {
            for (int j = i+1; j <dates.length ; j++) {
                String inum=toString(dates[i],"HHmmss");
                String jnum=toString(dates[j],"HHmmss");
                int i1=Integer.parseInt(inum);
                int j1=Integer.parseInt(jnum);
                if (i1>j1){
                    Date temp=dates[i];
                    dates[i]=dates[j];
                    dates[j]=temp;
                }
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dates[i*3+j]+"\t");
            }
            System.out.println("\t");
        }

    }
}