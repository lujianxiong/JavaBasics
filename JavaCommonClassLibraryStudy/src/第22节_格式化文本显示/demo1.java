package 第22节_格式化文本显示;
//范例：MessageFormat类进行格式化处理
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class demo1 {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        ResourceBundle resourceBundle = ResourceBundle.getBundle("cn.daxiong.message.MessageUtil",locale);
        String val = resourceBundle.getString("info");
        System.out.println(MessageFormat.format(val,"Daxiong",new SimpleDateFormat("yyyy=MM-dd").format(new Date())));
    }
}
