package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-24 20:06
 **/

public class XMLTest {
    public static void main(String[] args) throws DocumentException {
        //创建一个Dom4J提供的解析器对象
        SAXReader reader =new SAXReader();
        //使用saxReader
        Document read = reader.read("src/xml/data.xml");
        //从文档流对象中获得根元素对象 root
        Element rootElement = read.getRootElement();
        System.out.println("根元素名:"+rootElement.getName());

//        //获取根目录下的所有一级子元素
//        List<Element> elements = rootElement.elements();
//        for (Element element : elements) {
//            System.out.println("子元素名:"+element.getName());
//        }
        //拿到根目录下的某个子元素,如果下面有很多子元素,默认只拿第一个
        Element element = rootElement.element("data-item");
        System.out.println(element.element("sender").getText());

        //拿到元素的属性值
        Attribute id = element.attribute("id");
        System.out.println(id.getValue());


        //获取全部子元素
        System.out.println(element.elementText("sender"));
        System.out.println(element.elementText("receiver"));
        System.out.println(element.elementText("src"));
        System.out.println(element.elementText("current"));
        System.out.println(element.elementText("dest"));


        System.out.println("取出文本去除前后空格-----------------");
        System.out.println(element.elementTextTrim("sender"));
        System.out.println(element.elementTextTrim("receiver"));
        System.out.println(element.elementTextTrim("src"));
        System.out.println(element.elementTextTrim("current"));
        System.out.println(element.elementTextTrim("dest"));
    }
}
