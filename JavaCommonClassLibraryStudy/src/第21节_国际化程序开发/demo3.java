package 第21节_国际化程序开发;
//范例：指定德国区域资源文件
import java.util.Locale;
import java.util.ResourceBundle;

public class demo3 {
    public static void main(String[] args) {
        Locale locale = Locale.GERMAN;   //指定德国区域资源文件类型
        ResourceBundle resource = ResourceBundle.getBundle("cn.daxiong.message.MessageUtil",locale);
        System.out.println(resource.getString("info"));
        //这时候我们定义的资源文件中没有德国的，所以自动调用本地默认的资源文件：我的电脑本地环境为：zh_CN，因为读取zh_CN的资源文件

        //再有一种情况：如果该包中没有本地环境的，将读取没有任何区域语言的资源文件
    }
}
