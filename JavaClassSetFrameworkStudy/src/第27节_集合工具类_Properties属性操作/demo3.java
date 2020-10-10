package 第27节_集合工具类_Properties属性操作;
//范例：
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class demo3 {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        prop.load(new FileInputStream(new File("E:"+File.separator+"hello"+File.separator+"属性输出.properties")));
        System.out.println(prop.getProperty("Daxiong～"));

    }
}
