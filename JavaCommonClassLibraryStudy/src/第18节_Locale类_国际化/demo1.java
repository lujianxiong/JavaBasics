package 第18节_Locale类_国际化;
//范例：实例化Locale类对象
import java.util.Locale;

public class demo1 {
    public static void main(String[] args) {
        Locale loc = new Locale("zh","CN");    //表示中文环境
        System.out.println(loc);
    }
}
