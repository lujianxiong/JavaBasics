package 第12节_SimpleDateFormat日期格式化;
//范例：数字格式化
import java.text.NumberFormat;

public class demo5 {
    public static void main(String[] args) {
        double str = 2655875834.75858;
        String str2 = NumberFormat.getInstance().format(str);
        System.out.println(str2);
    }
}
