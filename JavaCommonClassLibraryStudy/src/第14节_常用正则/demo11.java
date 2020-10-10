package 第14节_常用正则;
//正则： 表示该正则表达式的长度正好是n   【正则表达式{n}】
public class demo11 {
    public static void main(String[] args) {
        String str = "   ";    //三个空格
        String regex = "\\s{3}";    //表示三个空格型数据
        System.out.println(str.matches(regex));    //true
    }
}
