package 第16节_java.util.regex开发包;
//范例：Matcher类 实现字符串匹配
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {
    public static void main(String[] args) {
        String str = "101";
        String regex = "\\d+";
        Pattern pat = Pattern.compile(regex);    //编译正则表达式
        Matcher matcher = pat.matcher(str);    //实例化一个Matcher对象
        System.out.println(matcher.matches());    //实现匹配
    }
}
