package 第14节_常用正则;
//正则：单个字符匹配：匹配空格：包括空格、换行、制表符    【\\s】
public class demo9 {
    public static void main(String[] args) {
        String str = "a\t";    //要判断的数据
        String regex = "\\D\\s";    //正则表达式
        System.out.println(str.matches(regex));    //true
    }
}

//注意：多个正则匹配的时候，需要一位对应一位。
