package xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-24 20:37
 **/
/*
<book>
    <name>从入门到精通</name>
    <author>dlei</author>
    <price>99.9</price>
</book>
* */
public class XMLTest2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
        builder.append("<book>");


        builder.append("<name>");
        builder.append("从入门到精通");
        builder.append("</name>");


        builder.append("<author>");
        builder.append("dlei");
        builder.append("</author>");


        builder.append("<price>");
        builder.append("99");
        builder.append("</price>");


        builder.append("</book>");
        try (
                FileWriter writer = new FileWriter(new File("src/xml/book.xml"));
        ) {
            writer.write(builder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
