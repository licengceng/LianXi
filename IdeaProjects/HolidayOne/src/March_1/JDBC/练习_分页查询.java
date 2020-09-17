package March_1.JDBC;

import java.sql.*;

//设计一个方法，进行分页查询
//public static void list(int start, int count)
//        start 表示开始页数，count表示一页显示的总数
//        list(0,5) 表示第一页，一共显示5条数据
//        list(10,5) 表示第三页，一共显示5条数据
public class 练习_分页查询 {
    public static void list(int start,int count){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try (
                Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/how2java?characterEncoding=utf-8&serverTimezone=UTC","root","root");
                Statement statement=connection.createStatement();
        ){
            String sql="select *from hero limit "+start+","+count;
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");// 可以使用字段名
                String name = resultSet.getString(2);// 也可以使用字段的顺序
                float hp = resultSet.getFloat("hp");
                int damage = resultSet.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        例子 --每页显示3条记录
//        SELECT * FROM 表名LIMIT 0,3；--第一页
//        SELECT * FROM 表名LIMIT 3,3；--第二页

//       例子 --每页显示5条记录
//        SELECT * FROM 表名LIMIT 0,5；--第一页 （0~4）   第二页（5~9）
//        SELECT * FROM 表名LIMIT 10,5；--第三页 （10~14）
        list(0,2); // 查询第一页的前两条数据
    }
}
