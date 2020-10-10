package 第42节_HTML正则拆分_类库案例六;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "<font face=\"Arial,Serif\" size=\"+2\" color=\"red\">";    //要验证的HTML
        String regex = "\\w+=\"[a-zA-Z0-9,\\+]+\"";    //正则表达式
        Matcher matcher = Pattern.compile(regex).matcher(str);//编译正则
        while (matcher.find()){  //如果有数据
            String temp = matcher.group(0);   //进行分组处理
            String result [] = temp.split("=");
            System.out.println(result[0]+"\t"+result[1].replaceAll("\"",""));
        }

    }
}
