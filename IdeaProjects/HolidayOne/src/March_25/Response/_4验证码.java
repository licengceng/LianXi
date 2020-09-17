package March_25.Response;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet( "/yanzhengServlet")
public class _4验证码 extends HttpServlet {
    int width=100;
    int height=50;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //1.创建验证码图片对象
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //2.美化图片
            //2.1填充背景色
        Graphics g = image.getGraphics();//画笔对象
        g.setColor(Color.pink);//设置画笔颜色
        g.fillRect(0,0,width,height);//填充边框
            //2.画边框
        g.setColor(Color.blue);
        g.drawRect(0,0,width-1,height-1);//边框本来有1px，需减一

        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklkmnopqrstuvwxyz0123456789";
            //3.生成随机角标
        Random random=new Random();
        for (int i = 0; i <4 ; i++) {  //生成4个
            int index = random.nextInt(str.length());
            //获取字符
            char ch = str.charAt(index);
            //写验证码
            g.drawString(ch+"",width/5*i,height/2);
        }
           //画6条干扰线
            g.setColor(Color.green);
        for (int i = 0; i <6 ; i++) {
            int x1 = random.nextInt(width);
            int x2 = random.nextInt(width);
            int y1 = random.nextInt(width);
            int y2 = random.nextInt(width);
            g.drawLine(x1,x2,y1,y2);
        }

        //3.将图片输出到页面展示
        ImageIO.write(image,"jpg",response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
