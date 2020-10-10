package 第14节_常用正则;
//正则： 逻辑：X表达式之后紧跟上Y表达式   【表达式X表达式Y】
public class demo12 {
    public static void main(String[] args) {
        String str = "ax";    //表达式a后面跟着表达式x
        String regex = "ax";    //
        System.out.println(str.matches(regex));    //true
    }
}
