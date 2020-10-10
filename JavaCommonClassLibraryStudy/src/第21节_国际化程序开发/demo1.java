package 第21节_国际化程序开发;
//进行默认资源读取
import java.util.ResourceBundle;

public class demo1 {
    public static void main(String[] args) {
        ResourceBundle resource = ResourceBundle.getBundle("cn.daxiong.message.MessageUtil");
        System.out.println(resource.getString("info"));
        //现在读取的是zh_CN的Message文件中的内容而不是Message文件中的内容
    }
}
