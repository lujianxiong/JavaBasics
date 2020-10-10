package 第20节_读取资源文件名称;
//范例：com.Daxiong.message.MessageUtil.properties资源文件
import java.util.ResourceBundle;

public class demo1 {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("cn.daxiong.message.MessageUtil");
        String val = resourceBundle.getString("info");
        System.out.println(val);
    }
}
