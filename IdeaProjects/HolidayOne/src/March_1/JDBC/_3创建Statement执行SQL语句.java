package March_1.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _3创建Statement执行SQL语句 {
//    Statement是用于执行SQL语句的，比如增加，删除
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try{
//            "jdbc:mysql://127.0.0.1:3306/how2" +
//                "java?characterEncoding=UTF-8&serverTimezone=UTC","root","root");
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/how2java?characterEncoding=utf-8&serverTimezone=UTC","root","root");
            System.out.println("连接成功,获取连接对象："+connection);
            // 注意：使用的是 java.sql.Statement
            // 不要不小心使用到： com.mysql.jdbc.Statement;
            statement = connection.createStatement();
            System.out.println("获取Statement对象："+statement);
//            s.execute执行sql语句
//            执行成功后，用mysql-front进行查看，明确插入成功
//            执行SQL语句之前要确保数据库how2java中有表hero（id,name,hp,damage）的存在，如果没有，需要事先创建表
            // 准备sql语句
            // 注意： 字符串要用单引号'   或：String sql = "insert into hero values(null,'提莫',313.0,50)";
            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            statement.execute(sql);
            System.out.println("执行插入语句成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
            if (statement != null)
                try {
                    statement.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            // 后关闭Connection
            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

    }
}
