package dao;
import domain.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {//ProductDAO提供对Product的查询
    public static void main(String[] args) {
        System.out.println(new ProductDAO().getProduct(1).getName());
        System.out.println(new ProductDAO().ListProduct().size());
    }
    public Product getProduct(int id){ //因为购买的时候，提交到服务器的是pid, 而OrderItem类的product属性是一个Product类型
        Product result=null;             //所以ProductDAO需要根据id获取Product对象
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/cart?characterEncoding=UTF-8&serverTimezone=UTC",
                    "root", "root");
            String sql="select *from product where id=?";
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                result=new Product();
                result.setId(id);

                String name=rs.getString(2);
                float price = rs.getFloat(3);

                result.setName(name);
                result.setPrice(price);
            }
            ps.close();
            c.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public List<Product> ListProduct() {
        List<Product> products = new ArrayList<Product>();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/cart?characterEncoding=UTF-8&serverTimezone=UTC",
                    "root", "root");

            String sql = "select * from product order by id desc";

            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float price = rs.getFloat(3);

                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                products.add(product);
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
        return products;
    }
}