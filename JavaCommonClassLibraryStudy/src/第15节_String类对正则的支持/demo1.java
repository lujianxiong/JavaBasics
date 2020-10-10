package 第15节_String类对正则的支持;
//String类 正则 匹配【Stting类的matches方法】
public class demo1 {
    public static void main(String[] args) {
        String str = "ab";    //输入的字符串
        String regex = "\\w{2}";    //正则表达式
        System.out.println(str.matches(regex));
    }
}
