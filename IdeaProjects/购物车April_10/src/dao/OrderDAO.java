package dao;

import domain.Order;

import java.sql.*;
//在购物车页面，增加一个创建订单的超链
//通过创建订单，在Order表里新增一条数据，同时把session中的订单条目都保存到数据库中。

//OrderDAO把订单对象保存到数据库中。
//这里需要注意的是，Order对象保存到数据库中后，该对象就会有对应的id，这个id，在后续保存OrderItem的时候，是作为order id存在的。
public class OrderDAO {
    public void insert(Order order){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/cart?characterEncoding=UTF-8&serverTimezone=UTC",
            "root", "root");

            String sql = "insert into order_ values(null,?)";

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setInt(1, order.getUser().getId());

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();//rder对象保存到数据库中后，该对象就会有对应的id，这个id，在后续保存OrderItem的时候，
            // 是作为order id存在的。所以在保存的数据库的时候，要获取自增长id
            if (rs.next()) {
                int id = rs.getInt(1);
                order.setId(id);
            }

            ps.close();

            c.close();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}