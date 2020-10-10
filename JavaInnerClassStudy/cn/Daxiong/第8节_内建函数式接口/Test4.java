package Daxiong.第8节_内建函数式接口;
//断言型函数式接口:（进行判断处理）    有输入参数、有返回值
import java.util.function.*;
public class Test4 {
    public static void main(String[] args) {
        Predicate<String> pre = "Daxiong"::equalsIgnoreCase;
        System.out.println(pre.test("DAXIONG"));
    }
}
