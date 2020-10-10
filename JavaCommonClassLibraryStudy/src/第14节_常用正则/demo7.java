package 第14节_常用正则;
//正则：单个字符匹配：表示数字：等价于[0-9]的范围    【\\d】
public class demo7 {
    public static void main(String[] args) {
        String str = "0";    //要判断的数据
        String regex = "\\d";    //正则表达式
        System.out.println(str.matches(regex));    //true
    }
}
