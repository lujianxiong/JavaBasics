package 第16节_java.util.regex开发包;
//范例：Matcher类 实现字符串替换
//将所有非数字全部替换为空，实现数字的全部取出
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo3 {
    public static void main(String[] args) {
        String str = "1214321dqc3 t236b245214b 623v5c1b5u i2314     214c214 t3  bb";
        String regex = "\\D+";   //非数字
        Pattern pat = Pattern.compile(regex);    //编译正则表达式
        Matcher matcher = pat.matcher(str);    //实例化一个Matcher对象
        System.out.println(matcher.replaceAll(""));    //实现匹配
    }
}
