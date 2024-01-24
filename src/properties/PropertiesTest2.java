package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-24 19:23
 **/

public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //记载
        properties.load(new FileReader("src/properties/assets/userInfo.txt"));
        //直接判断是否包含淀粉肠
        if (properties.containsKey("淀粉肠")) {
            System.out.println("找到了");
            properties.setProperty("淀粉肠", "18");
        }
        //将文件写出去
        properties.store(new FileWriter("src/properties/assets/userInfo.txt"), "success");
    }
}
