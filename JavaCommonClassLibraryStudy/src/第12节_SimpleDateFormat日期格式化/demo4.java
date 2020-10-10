package 第12节_SimpleDateFormat日期格式化;
//范例：将字符串日期转为Date
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo4 {
    public static void main(String[] args) throws ParseException {
        String birthday = "1846-11-11 11:11:11.111";    //字符串形式的日期
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:s.SSS");    //匹配日期格式
        Date date = dateformat.parse(birthday);    //将字符串格式化为Date标准格式
        System.out.println(date);
    }
}
