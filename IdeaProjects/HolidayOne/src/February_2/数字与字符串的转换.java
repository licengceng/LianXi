package February_2;

public class 数字与字符串的转换 {
    public static void main(String[] args) {
                 // 数字转字符串
                int i = 5;

                //方法1 使用String类的静态方法valueOf
                String str = String.valueOf(i);

                //方法2 先把基本类型装箱为对象，然后调用对象的toString
                Integer it = i;
                String str2 = it.toString();

                // 字符串转数字 调用Integer的静态方法parseInt
                String string = "999";

                int i2= Integer.parseInt(string);

                System.out.println(i2);
            }
        }

