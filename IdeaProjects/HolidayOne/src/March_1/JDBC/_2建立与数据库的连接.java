package March_1.JDBC;
import java.sql.Connection;
//&serverTimezone=UTC  --若出现了mysql的无效连接属性异常：
// 服务器时区值无法辨认或表示多个时区，如果你想使用时区支持,
// 你必须通过服务器时区配置属性来配置服务器或JDBC驱动从而使用更具体的时区值。
// https://blog.csdn.net/syc000666/article/details/100580972
import java.sql.DriverManager;
import java.sql.SQLException;
//建立与数据库的Connection连接
//        这里需要提供：
//        数据库所处于的ip:127.0.0.1 (本机)
//        数据库的端口号： 3306 （mysql专用端口号）
//        数据库名称 how2java
//        编码方式 UTF-8
//        账号 root
//        密码 admin
public class _2建立与数据库的连接 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c= DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/how2" +
                    "java?characterEncoding=UTF-8&serverTimezone=UTC","root","root");
            System.out.println("连接成功,获取连接对象："+c);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
