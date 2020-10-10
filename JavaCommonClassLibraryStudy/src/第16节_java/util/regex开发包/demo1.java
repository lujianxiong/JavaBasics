package 第16节_java.util.regex开发包;
//范例Pattern类实现 字符串拆分
import java.util.regex.Pattern;

public class demo1 {
    public static void main(String[] args) {
        String str = "sacih33$^$%#RQ#VB@^%V RGCRFQVDAWVF";
        String regex = "[^a-zA-Z]+";
        Pattern pat = Pattern.compile(regex);    //使用Pattern类编译正则表达式
        String result[] = pat.split(str);  //根据正则，进行字符串拆分
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
