package 第18节_Locale类_国际化;
//范例：获取本地默认环境
import java.util.Locale;

public class demo2 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();    //获取默认环境
        System.out.println(locale);
    }
}
