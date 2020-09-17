package March_18.XML.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*jsoup是java的html解析器，也可解析xml*/
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象，根据xml文档获取
            //1.1获取student.xml的path
            String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
            //1.2解析xml文档，加载文档进内存，获取dom树-->Document
            Document document = Jsoup.parse(new File(path), "utf-8");
        //2.获取元素对象  根据标签名称获取
             Elements elements= document.getElementsByTag("name");//查看源码Elements继承ArrayList集合
        System.out.println(elements.size());
        System.out.println(elements.get(0));//获取student.xml文档name属性的第一个name取值张三
    }
}
