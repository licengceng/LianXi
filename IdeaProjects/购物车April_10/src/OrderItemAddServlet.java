import dao.ProductDAO;
import domain.OrderItem;
import domain.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderItemAddServlet extends HttpServlet {
    @Override
    /*购买行为本身就是创建一个OrderItem对象
    在负责购买商品的OrderItemAddServlet 中，进行如下流程
    1. 获取购买数量
    2. 获取购买商品的id
    3. 根据id获取商品对象
    4. 创建一个新的OrderItem对象
    5. 从session中取出一个List , 这个List里面存放陆续购买的商品。
    如果是第一次从session中获取该List,那么它会是空的，需要创建一个ArrayList
    6. 把新创建的OrderItem对象放入该List 中
    7. 跳转到显示购物车的listOrderItem*/
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));
        int pid = Integer.parseInt(request.getParameter("pid"));
        Product p = new ProductDAO().getProduct(pid);

        OrderItem oi=new OrderItem();
        oi.setNum(num);
        oi.setProduct(p);

        List<OrderItem> ois= (List<OrderItem>) request.getSession().getAttribute("ois");
        if (null== ois){
            ois = new ArrayList<>();
            request.getSession().setAttribute("ois",ois);
        }
        /*
        * 遍历session中所有的OrderItem
        如果找到对应的product.id一样的条目，就调整其数量
        如果没有找到，就新增加一条 */
        boolean found=false;
        for (OrderItem orderItem:ois) {
            if (orderItem.getProduct().getId()==oi.getProduct().getId()){
                orderItem.setNum(orderItem.getNum()+oi.getNum());
                found=true;
                break;
            }
        }
        if (!found)
            ois.add(oi);

        //动态获取虚拟目录（tomcat）
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/OrderItemListServlet");
    }
}
