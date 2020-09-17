package dao.impl;

import dao.ItemsDao;
import domain.Items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemsDaoImpl implements ItemsDao {
    public List<Items> findAll() {
        String sql="select *from items items";
        List<Items> list=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动类
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                //获取connection对象
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/maven?characterEncoding=UTF-8&serverTimezone=UTC",
                        "root", "root");
                //获取真正操作数据的对象
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            //执行数据库的查询
            ResultSet resultSet = preparedStatement.executeQuery();
            //把数据库结果转成java的List集合
           list=new ArrayList<Items>();// List<Items> list=new ArrayList<Items>();

            while (resultSet.next()){
                Items items=new Items();
                items.setId(resultSet.getInt(1));
                items.setName(resultSet.getString(2));

                list.add(items);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
