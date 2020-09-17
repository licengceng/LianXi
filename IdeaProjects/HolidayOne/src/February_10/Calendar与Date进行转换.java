package February_10;
import java.util.Calendar;
import java.util.Date;

public class Calendar与Date进行转换 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
       // 通过日历对象得到日期对象
        Date now = c.getTime();

        Date d2 = new Date(0);
        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
    }
}
