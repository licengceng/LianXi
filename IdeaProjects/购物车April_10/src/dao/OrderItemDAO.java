package dao;

import domain.OrderItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderItemDAO {
    //将OrderItem保存到数据库中
    public void insert(OrderItem oi){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/cart?characterEncoding=UTF-8&serverTimezone=UTC",
                    "root", "root");
            String sql = "insert into orderitem values(null,?,?,?)";
            PreparedStatement ps=c.prepareStatement(sql);

            ps.setInt(1,oi.getProduct().getId());
            ps.setInt(2,oi.getNum());
            ps.setInt(3,oi.getOrder().getId());

            ps.execute();

            ps.close();
            c.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
