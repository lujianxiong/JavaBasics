package 第12节_SimpleDateFormat日期格式化;
//范例：格式化日期显示
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo3 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:s.SSS");     //匹配日期格式  （pattern即格式、式样）
        String str = sdf.format(date);    //将data日期格式化为自定义形式的字符串日期   （接受Date对象，返回字符串）
        System.out.println(str);

    }
}
