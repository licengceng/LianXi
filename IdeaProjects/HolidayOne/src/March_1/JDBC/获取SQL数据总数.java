package March_1.JDBC;

import java.sql.*;

//执行的sql语句为
//        select count(*) from hero
//        然后通过ResultSet获取出来
public class 获取SQL数据总数 {
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEnco" +
                            "ding=UTF-8&serverTimezone=UTC", "root", "root");
                 Statement s = c.createStatement())
            {
                    String sql = "select count(*) from hero";
                    ResultSet rs = s.executeQuery(sql);
                    int total = 0;
                    while (rs.next()) {
                        total = rs.getInt(1);
                    }
                    System.out.println("表Hero中总共有:" + total + " 条数据");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }