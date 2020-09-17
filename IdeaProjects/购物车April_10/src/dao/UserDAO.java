package dao;

import domain.User;

import java.sql.*;

public class UserDAO { //根据name和password查询表user,如果有数据就表示账号密码正确
    public static void main(String[] args) {
//        if (null!=(new UserDAO().getUser("tom","123"))){ //如果对象不为空
//            System.out.println(new UserDAO().getUser("tom", "123").getId());
//        }else {
//            System.out.println("null");
//        }
        System.out.println(new UserDAO().getUser("tom", "123").getId());
    }
    public User getUser(String name,String password)  {
        User result=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql="select * from user where name = ? && password = ? ";
        try(
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost/cart?characterEncoding=UTF-8&serverTimezone=UTC",
                        "root", "root");
                PreparedStatement ps=c.prepareStatement(sql);
                ) {
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                result = new User();
                result.setId(resultSet.getInt(1));
                result.setPassword(password);
                result.setName(name);
            }

        } catch ( SQLException e) {
            e.printStackTrace();
        }
        return result ;
    }
}
