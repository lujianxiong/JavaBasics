package 第16节_java.util.regex开发包;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo4 {
    public static void main(String[] args) {
        //要求取出“#{内容}”标记中的所有内容
        String str = "INSERT INTO dept(deptno,dname,loc) VALUES(#{depno},#{dname},#{loc})";
        String regex = "#\\{\\w+\\}";    //{}符号需要进行转义
        Pattern pat = Pattern.compile(regex);    //编译正则表达式
        Matcher mat = pat.matcher(str);
        while (mat.find()){    //是否有匹配成功的内容
            System.out.println(mat.group(0).replaceAll("#|\\{|\\}",""));  //进行分组过程
            //将#{}符号都替换成空; "|"表示或，加了这个逻辑表达式之后，可以把这三个符号都替换
        }
    }
}

//注意：正则中有些字符是定义成正则符号的，如果不进行转义，在字符串中表示的是字符，转义之后才是正则符号！