package 第14节_常用正则;
//正则：多个字符匹配：表示该正则可以出现0次、1次或多次   【正则表达式+“*”】
public class demo10 {
    public static void main(String[] args) {
        String str = "";    //要判断的数据
        String regex = "\\w*";    //正则表达式
        System.out.println(str.matches(regex));    //true
    }
}
