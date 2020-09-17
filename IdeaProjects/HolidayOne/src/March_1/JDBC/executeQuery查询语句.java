package March_1.JDBC;
import java.sql.*;
public class executeQuery查询语句 {
    //executeQuery 执行SQL查询语句,注意： 在取第二列的数据的时候，用的是rs.get(2) ，而不是get(1).
//        这个是整个Java自带的api里唯二的地方，使用基1的，即2就代表第二个。
//        另一个地方是在PreparedStatement这里
    public static void main(String[] args) {
        try {
            //1.驱动
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try (
                //2.连接
                Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/how2java?characterEncoding=utf-8&serverTimezone=UTC","root","root");
                //3.创立执行SQL对象
                Statement statement=connection.createStatement();
                ){
                    String sql="select *from hero";
                //4.执行查询语句，并把结果集返回给ResultSet
                ResultSet resultSet = statement.executeQuery(sql);
                    while (resultSet.next()){
                       int id= resultSet.getInt("id");
                       String name= resultSet.getString(2); //获取第二列数据
                       float hp= resultSet.getFloat("hp");
                       int damage= resultSet.getInt(4);//获取第四列数据
                        System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,damage);
                    }
                    // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
                    // resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
