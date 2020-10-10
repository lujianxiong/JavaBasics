package 第14节_常用正则;
//正则：与单个字符匹配    【a】
public class demo1 {
    public static void main(String[] args) {
        String str = "a";    //要判断的数据
        String regex = "a";    //正则表达式
        System.out.println(str.matches(regex));    //true
    }
}
