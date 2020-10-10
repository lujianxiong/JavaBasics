package 第14节_常用正则;
//正则：单个字符匹配：由一个任意字母所组成，不区分大小写  【[a-zA-Z]】
public class demo4 {
    public static void main(String[] args) {
        String str = "d";    //要判断的数据
        String regex = "[a-zA-Z]";    //正则表达式
        System.out.println(str.matches(regex));    //true
    }
}
