package properties;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-24 19:00
 **/

public class PropertiesTest {
    public static void main(String[] args) {
        //需求:读取userinfo中的数据,把"麻辣豆腐"的价格改成30
        Map<String, String> infos = new HashMap<>();

        try (
                BufferedReader reader = new BufferedReader(new FileReader("src/properties/assets/userInfo.txt"));
        ) {
            String res;
            while ((res = reader.readLine()) != null) {
                String[] split = res.split("=");
                infos.put(split[0], split[1]);
            }
            infos.forEach((k, v) -> {
                if (k.equals("麻辣豆腐")) {
                    infos.put("麻辣豆腐", "30");
                }
            });
//            infos.forEach((k,v)->{
//                try {
//                    writer.write(k+"="+v);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
            System.out.println(infos);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/properties/assets/userInfo.txt"));
        ) {
            infos.forEach((k, v) -> {
                try {
                    writer.write(k + "=" + v+"\r\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
