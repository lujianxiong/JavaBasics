package 第27节_集合工具类_Properties属性操作;
//范例：观察属性的设置和取得
import java.util.Properties;

public class demo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        //Properties类操作的类型只能是字符串
        prop.setProperty("Daxiong～","生日快乐！");
        prop.setProperty("BeiJing","北京");
        System.out.println(prop.getProperty("Daxiong～"));
        System.out.println(prop.getProperty("baidu"));
        System.out.println(prop.getProperty("baidu","NoFound!!"));
    }
}
