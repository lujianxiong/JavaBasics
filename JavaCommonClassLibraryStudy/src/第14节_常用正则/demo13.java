package 第14节_常用正则;
//正则： 逻辑：有一个表达式满足即可   【表达式X|表达式Y】
public class demo13 {
    public static void main(String[] args) {
        String str = "1";    //表达式a后面跟着表达式x
        String regex = "\\d|\\s";    //
        System.out.println(str.matches(regex));    //true
    }
}
