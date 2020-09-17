package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/OrderItemListServlet")
public class OrderItemListServlet extends HttpServlet {
        //显示购物车的OrderItemListServlet 其实什么也没做，因为数据已经在session准备好了，直接服务端跳转到listOrderItem.jsp
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/listOrderItem.jsp").forward(request,response);
    }
}
