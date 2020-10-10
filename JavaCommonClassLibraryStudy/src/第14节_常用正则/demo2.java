package 第14节_常用正则;
//正则：单个字符与字符集匹配    【[abc]】
public class demo2 {
    public static void main(String[] args) {
        String str = "a";    //要判断的数据
        String regex = "[abc]";    //正则表达式
        System.out.println(str.matches(regex));     //true
    }
}
