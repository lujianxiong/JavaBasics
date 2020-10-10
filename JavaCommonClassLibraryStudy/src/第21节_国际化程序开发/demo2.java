package 第21节_国际化程序开发;
//修改Locale环境，进行资源读取
import java.util.Locale;
import java.util.ResourceBundle;

public class demo2 {
    public static void main(String[] args) {
        //Locale locale = new Locale("en","US");
        Locale locale = Locale.US;    //这行代码和上面一行的作用本质是一样的
        //第一行注释掉的是自己实例化的一个英文的Locale对象
        //第二行是直接调用Locale类中定义的静态全局常量
        ResourceBundle resource = ResourceBundle.getBundle("cn.daxiong.message.MessageUtil",locale);
        System.out.println(resource.getString("info"));
        //现在读取的是英文
    }
}
