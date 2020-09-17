package March_2.JDBC.ORM;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//把一个Hero对象插入到数据库中
//public static void add(Hero h)
//        把这个Hero对象对应的数据删除掉
//public static void delete(Hero h)
//        更新这条Hero对象
//public static void update(Hero h)
//        把所有的Hero数据查询出来，转换为Hero对象后，放在一个集合中返回
//public static List<Hero> list();
public class 练习_ORM {
    public static void add(Hero h){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        String sql="insert into hero values(null ,?,?,?) ";
        try (
                Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8&serverTimezone=UTC","root", "root");
           PreparedStatement preparedStatement=connection.prepareStatement(sql)){
            preparedStatement.setString(1,h.name);
            preparedStatement.setFloat(2,h.hp);
            preparedStatement.setInt(3,h.damage);
            preparedStatement.execute();
            System.out.println("操作成功,新增英雄的id为："+h.id);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void delete(Hero h){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        String sql="delete from hero where id=? ";
        try(
                Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8&serverTimezone=UTC","root", "root");
                PreparedStatement preparedStatement=connection.prepareStatement(sql)
                ){
            preparedStatement.setInt(1,h.id);
            preparedStatement.execute();
            System.out.printf("已删除id为%d的英雄",h.id);
        }catch ( SQLException e){
            e.printStackTrace();
        }
    }
    //        把所有的Hero数据查询出来，转换为Hero对象后，放在一个集合中返回
    public static List<Hero> list(){
        List<Hero> heroList=new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        String sql="select *from hero";
        try(
                Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8&serverTimezone=UTC","root", "root");
                Statement statement=connection.createStatement();
        ){
           ResultSet resultSet= statement.executeQuery(sql);
           while(resultSet.next()){
                Hero hero=new Hero();
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                float hp=resultSet.getFloat(3);
                int damage=resultSet.getInt(4);
                hero.id=id;
                hero.name=name;
                hero.hp=hp;
                hero.damage=damage;
                heroList.add(hero);
            }
        }catch ( SQLException e){
            e.printStackTrace();
        }
        return heroList;
    }
    public static void update(Hero h){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        String sql="update hero set name=?,hp=?,damage=? where id=? ";
        try(
                Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8&serverTimezone=UTC","root", "root");
                PreparedStatement preparedStatement=connection.prepareStatement(sql)
        ){
            preparedStatement.setString(1,h.name);
            preparedStatement.setFloat(2,h.hp);
            preparedStatement.setInt(3,h.damage);
            preparedStatement.setInt(4,h.id);
            preparedStatement.execute();
        }catch ( SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
            Hero hero=new Hero();
        System.out.println("展示所有英雄：");
        List heros=list();
        System.out.println(heros);
        System.out.println("增加一个名字为\'亚索\'的英雄：");
        hero.name="亚索";
            add(hero);
        System.out.println("展示所有英雄：");
        heros=list();
        System.out.println(heros);
        System.out.println("删除id为3的英雄：");
        hero.id=3;
            delete(hero);
        System.out.println("展示所有英雄：");
        heros=list();
        System.out.println(heros);
        System.out.println("修改id为1英雄的姓名,hp和damage:");
        hero.id=1;
        hero.name="武器大师";
        hero.damage=900;
        hero.hp=600;
        update(hero);
        System.out.println("展示所有英雄：");
        heros=list();
        System.out.println(heros);
    }
}
