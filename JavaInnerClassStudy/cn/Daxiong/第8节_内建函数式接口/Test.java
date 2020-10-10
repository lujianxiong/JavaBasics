package Daxiong.第8节_内建函数式接口;
//功能型函数式接口:  有输入参数、有返回值;   返回值得println，否则无法显示
import java.util.function.*;
public class Test {
    public static void main(String[] args) {    //"**Hello"是一个对象， "**"是输入的字符串
        Function<String,Boolean> fun = "**Hello"::startsWith;  //startsWith方法是判断字符串是否以“...”开头
        System.out.println(fun.apply("**"));
    }
}
