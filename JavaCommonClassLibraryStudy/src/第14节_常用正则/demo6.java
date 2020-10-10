package 第14节_常用正则;
//正则：单个字符匹配：表示任意一个字符    【.】
public class demo6 {
    public static void main(String[] args) {
        String str = "/";    //要判断的数据
        String regex = ".";    //正则表达式
        System.out.println(str.matches(regex));    //true
    }
}
