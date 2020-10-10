package 第14节_常用正则;
//正则：单个字符匹配：表示由一位数字所组成     【[0-9]】
public class demo5 {
    public static void main(String[] args) {
        String str = "1";    //要判断的数据
        String regex = "[0-9]";    //正则表达式
        System.out.println(str.matches(regex));    //true
    }
}
