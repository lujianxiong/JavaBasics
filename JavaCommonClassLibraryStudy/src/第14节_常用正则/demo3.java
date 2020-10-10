package 第14节_常用正则;
//正则：单个字符匹配：不在字符集内 【[^abc]】
public class demo3 {
    public static void main(String[] args) {
        String str = "d";    //要判断的数据
        String regex = "[^abc]";    //正则表达式
        System.out.println(str.matches(regex));    //true
    }
}
